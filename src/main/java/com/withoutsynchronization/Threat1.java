package com.withoutsynchronization;

public class Threat1 extends Thread {
  Print print;

  public Threat1(Print print) {
    this.print = print;
  }

  public void run(){
    print.printPrint(5);
  }
}
