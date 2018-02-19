package com.streamsapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class AnotherStreamIndex {
    public static void main(String args[]){
        ArrayList<HashMap<String, String>> info = new ArrayList<HashMap<String, String>>(){{
            add(new HashMap<String, String>(){{
                put("name", "vivek");
            }});

            add(new HashMap<String, String>(){{
                put("name", "rahul");
            }});

            add(new HashMap<String, String>(){{
                put("name", "anurag");
            }});
        }};

        System.out.println(info.stream().map(e -> e.get("name")).collect(Collectors.toList()));
    }
}
