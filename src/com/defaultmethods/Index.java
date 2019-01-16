package com.defaultmethods;

import java.util.ArrayList;

public class Index implements Father, Mother {

    @Override
    public void hairProperties() {
        System.out.println("black and short");
    }

    public static void main(String[] args){
        Index index = new Index();
        index.hairProperties();

        System.out.println(new ArrayList<Integer>(){{add(56);add(76);}});

    }
}
