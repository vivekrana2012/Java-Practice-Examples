package com.fileToDBOps;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args){

        long start_time = System.nanoTime();

        // Get the Path of directory "myDir"
        Path path = Paths.get("myDir");

        try {
            // Get the stream of files(Path) from the path.
            Stream files = Files.list(path);

            // forEach work on the file.
            files.forEach(file -> {

                // Gets the reader based on the file extension.
                Reader reader = Readers.getReader((Path)file);

                // work on the file.
                workOn((Path)file, reader);
            });

        }catch (Exception ex){
            ex.printStackTrace();
        }

        long end_time = System.nanoTime();

        System.out.println("Total time taken is: " + ((end_time - start_time) / 1000000) + " ms.");
    }

    /**
     * Work on the file. Calculates and souts the average salary.
     * @param path
     * @param reader
     */
    public static void workOn(Path path, Reader reader){

        List<EmployeeRecord> employeeRecordList = reader.read(path);

        OptionalDouble averageSalaryOptional = employeeRecordList.stream().mapToInt(employeeRecord -> employeeRecord.getSalary_in_usd()).average();

        System.out.print("Average salary is: ");
        averageSalaryOptional.ifPresent(System.out::println);

    }
}