package com.streamexample;

public class StudentData {

    String Name;
    int rollNumber;

    public StudentData(int rollNumber, String name){
        setRollNumber(rollNumber);
        setName(name);
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
