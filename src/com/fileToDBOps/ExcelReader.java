package com.fileToDBOps;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader implements Reader {

    @Override
    public List<EmployeeRecord> read(Path path) {

        List<EmployeeRecord> employeeRecordList = new ArrayList();

        Workbook wb = null;

        try {
            InputStream is = new FileInputStream(path.toFile());

            if ("xls".equals(path.toString().split("\\."))) {
                wb = new HSSFWorkbook(is);
            } else {
                wb = new XSSFWorkbook(is);
            }

            Sheet sheet = wb.getSheetAt(0);

            int numberOfRows = sheet.getPhysicalNumberOfRows();

            for(int counter = 1; counter < numberOfRows; counter++){
                Row row = sheet.getRow(counter);

                employeeRecordList.add(new EmployeeRecord.Builder()
                        .setCountry(row.getCell(0).toString())
                        .setSalary((int)Float.parseFloat(row.getCell(1).toString()))
                        .setCurrency(row.getCell(2).toString())
                        .setExchange_rate_to_usd((int)Float.parseFloat(row.getCell(3).toString()))
                        .setSalary_in_usd((int)Float.parseFloat(row.getCell(1).toString()) * (int)Float.parseFloat(row.getCell(3).toString()))
                        .build());

            }

        }catch (IOException ex){
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }

        return employeeRecordList;
    }
}