package com.withoutsynchronization;

public class Threat2 extends Thread{
  Print print;

  public  Threat2( Print print){
    this.print = print ;
  }

  public void run(){
    print.printPrint(100);
  }
}
