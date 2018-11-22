package com.metrofaresystem;

public class Wallet {

  private float balance = 0;

  public Wallet(float balance){
    this.balance = balance;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }
}
