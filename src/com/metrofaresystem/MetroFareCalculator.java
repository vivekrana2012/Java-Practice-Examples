package com.metrofaresystem;

import java.time.LocalDate;

public class MetroFareCalculator {

  private Wallet wallet = null;
  private Stations startingStation;
  private Stations endingStation;

  public MetroFareCalculator(Wallet wallet, Stations startingStation, Stations endingStation){
    this.wallet = wallet;
    this.startingStation = startingStation;
    this.endingStation = endingStation;
  }

  public float getRate(){
    String day = LocalDate.now().getDayOfWeek().name();

    try{
      Weekday.valueOf(day);

      return RateConstants.WEEKEND_RATE;
    }catch(IllegalArgumentException ex){
      return RateConstants.WEEKDAY_RATE;
    }
  }

  public int getNumberOfStationsTravelled(Stations startingStation, Stations endingStation){
    Stations[] stationValues = Stations.values();

    int startingIndex = 0;
    int endingIndex = 0;

    for(int counter = 0; counter < stationValues.length; counter++){
      if(stationValues[counter].equals(startingStation))
        startingIndex = counter;
      else if(stationValues[counter].equals(endingStation))
        endingIndex = counter;
    }

    return endingIndex - startingIndex;
  }

  public float calculateFare(){
    return this.wallet.getBalance() - (getRate() * getNumberOfStationsTravelled(this.startingStation,
        this.endingStation));
  }

}
