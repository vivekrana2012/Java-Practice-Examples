package com.gcexample;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Index {

    private static Unsafe unsafe;

    static {
        try{
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);

            unsafe = (Unsafe) field.get(null);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static long addressOf(Object mine){
        Object[] array = new Object[]{mine};

        long baseOffset = unsafe.arrayBaseOffset(Object[].class);
        int addressSize = unsafe.addressSize();

        long objectAddress = 0;

        switch (addressSize){
            case 4:
                objectAddress = unsafe.getInt(array, baseOffset);
                break;
            case 8:
                objectAddress = unsafe.getLong(array, baseOffset);
                break;
            default:
                System.out.println("Unsupported size: "+addressSize);
        }

        return objectAddress;
    }

    public static void main(String... args){

        IntStream.rangeClosed(0, 32000).forEach(item -> {
            Object mine = new GCMe();
            long address = addressOf(mine);
            System.out.println(address);
        });
    }
}
