package com.withoutsynchronization;

public class AppMain {
  public static void main(String args[]) {
    Print print = new Print();
    Threat1 threat1 = new Threat1(print);
    Threat2 threat2 = new Threat2(print);
    threat1.start();
    threat2.start();
  }
}
