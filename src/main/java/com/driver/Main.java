package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly rw = new RWOnly();
    //rw.name="chagan"; //error : 'name' has private
    //System.out.println(rw.name);
    rw.setName("Gagan");
    System.out.println(rw.getName());
  }
}