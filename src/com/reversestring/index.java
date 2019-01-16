package com.reversestring;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class index {
    public static void main(String[] args){

        String str = "reverse this string";

        System.out.println(str);

        System.out.println(LocalDateTime.now());

        int stringLength = str.length();

        char[] charArray = new char[stringLength];

        for(int i = stringLength - 1; i >= 0; i--){
            charArray[stringLength - 1 - i] = str.charAt(i);
        }

        for(int i = 0; i < stringLength; i++){
            System.out.print(charArray[i]);
        }

        System.out.println(LocalDateTime.now());

        System.out.print("\n OR \n");

        System.out.println(new StringBuilder(str).reverse().toString());

        System.out.println(LocalDateTime.now());
    }
}
