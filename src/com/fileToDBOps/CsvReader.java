package com.fileToDBOps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CsvReader implements Reader {

    @Override
    public List<EmployeeRecord> read(Path path) {

        List<EmployeeRecord> employeeRecordList = new ArrayList();

        try{
            Stream<String> stream = Files.lines(path);

            stream.skip(1).forEach(e -> {
                String[] items = e.split(",");

                employeeRecordList.add(new EmployeeRecord.Builder()
                        .setCountry(items[0])
                        .setCurrency(items[2])
                        .setSalary(Integer.parseInt(items[1]))
                        .setExchange_rate_to_usd(Integer.parseInt(items[3]))
                        .setSalary_in_usd(Integer.parseInt(items[1]) * Integer.parseInt(items[3]))
                        .build());

            });

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        return employeeRecordList;
    }
}
