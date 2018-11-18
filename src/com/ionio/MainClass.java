package com.ionio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args){

        File dir = new File("myDir");

        dir.mkdir();

        File textFile1 = new File(dir.getPath(), "textFile1.txt");

        Path path = Paths.get(textFile1.toURI());

        System.out.println(path.toString());

        try {
            textFile1.createNewFile();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        String[] items = dir.list();

        Arrays.stream(items).forEach(System.out::println);
    }
}