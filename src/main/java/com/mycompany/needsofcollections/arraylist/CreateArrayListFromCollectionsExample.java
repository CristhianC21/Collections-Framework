/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class CreateArrayListFromCollectionsExample {
    public static void main(String[] args) {
        //METHOD 1
        //Using ArrayLisy(Collection C) constructor
        
        //create arrayList object
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(1);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        
        //How to add all elements from an existing colleciton to the
        //new ArrayLlst using addAll() method.
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
  
        firstFivePrimeNumbers.addAll(nextFivePrimeNumbers);
        
        System.out.println(firstFivePrimeNumbers);
        
    }
}
