// Created on:  Dec-2021
// Created by:  Jonathan Pasco-Arnone

import java.util.ArrayList;

public class MrCoxallStack {
  // Create the stack as an ArrayList
  ArrayList<Integer> stackAsArray = new ArrayList<Integer>();
  public void push(Integer pushNumber) {
    stackAsArray.add(pushNumber);
  }
  Integer counter;

  public void showStack() {
    System.out.println(stackAsArray);
  }
}