package com.metrofaresystem;

public class MainClass {

  public static void main(String[] args){

    MetroFareCalculator calculator = new MetroFareCalculator(new Wallet(50), Stations.A1,
        Stations.A9);

    System.out.println(calculator.calculateFare());

  }
}
