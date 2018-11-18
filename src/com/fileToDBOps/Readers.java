package com.fileToDBOps;

import java.nio.file.Path;

public class Readers {

    public static Reader getReader(Path file){

        // split the file name to get the extension.
        String[] parts = file.toString().split("\\.");

        // return based on the extension. Else return null.
        switch(parts[1]){
            case "csv":{
                return new CsvReader();
            }
            case "xls":
            case "xlsx":{
                return new ExcelReader();
            }
            default:
                System.out.println("This format is not yet supported");
        }

        return null;
    }
}
