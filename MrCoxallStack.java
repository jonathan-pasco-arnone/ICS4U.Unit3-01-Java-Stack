// Created on:  Dec-2021
// Created by:  Jonathan Pasco-Arnone

import java.util.ArrayList;

/**
* This is the class that contains many functions.
*/
public final class MrCoxallStack {
  // Create the stack as an ArrayList
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();
  
  /**
  * Adds a number to the ArrayList,
  *
  * @param pushNumber this is the inputtes number to be added
  */
  public void push(Integer pushNumber) {
    stackAsArray.add(pushNumber);
  }
  Integer counter;
  
  /**
  * Prints the ArrayList.
  *
  */
  public void showStack() {
    System.out.println(stackAsArray);
  }
}
