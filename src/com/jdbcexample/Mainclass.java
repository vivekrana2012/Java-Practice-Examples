package com.jdbcexample;

import com.longestchain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mainclass {

    private static final String URL = "jdbc:mysql://localhost/videoanalytics";
    private static final String USERNAME = "myuser";
    private static final String PASSWORD = "mypassword";

    private static final String QUERY = "select * from user;";

    public static void main(String[] args){

        try {
            Connection conn = DriverManager.getConnection(Mainclass.URL, Mainclass.USERNAME, Mainclass.PASSWORD);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(Mainclass.QUERY);

            List<User> users = new ArrayList<>();

            while (rs.next()){
                users.add(new User(rs.getInt("id"), rs.getString("username"),
                        rs.getString("email"), rs.getString("fileId")));
            }

            conn.close();

            users.stream().forEach(System.out::println);

        }catch (SQLException ex){
            ex.printStackTrace();
        }finally {

        }

    }
}
