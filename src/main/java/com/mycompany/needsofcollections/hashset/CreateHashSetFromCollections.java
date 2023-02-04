/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author crist
 */

//1. Create a HashSet from another collection using HasjSet(Collection c) constructor.
//2. Add all elements from a collection to the HashSet using addAll() method.


public class CreateHashSetFromCollections {
    public static void main(String[] args) {
        //First 5 even numbers
        //Set<Integer> firstEvenNumbers = new HashSet<>();
        List<Integer> firstEvenNumbers = new ArrayList<>();
        
        firstEvenNumbers.add(2);
        firstEvenNumbers.add(4);
        firstEvenNumbers.add(6);
        firstEvenNumbers.add(8);
        firstEvenNumbers.add(10);
        System.out.println("First Five even numbers HashSet -> "+firstEvenNumbers);
        
        Set<Integer> firstTenNumbers = new HashSet<>(firstEvenNumbers);       
        System.out.println("Next five numbers HashSet ->"+firstTenNumbers);
        
       // Set<Integer> nextFiveNumbers = new HashSet<>();
        List<Integer> nextFiveNumbers = new ArrayList   <>();
         
        nextFiveNumbers.add(12);
        nextFiveNumbers.add(14);
        nextFiveNumbers.add(16);
        nextFiveNumbers.add(18);
        nextFiveNumbers.add(20);
        System.out.println("last five numbers HashSet -> "+nextFiveNumbers);
     
        firstTenNumbers.addAll(nextFiveNumbers);
        
        System.out.println("Ten numbers HashSet -> "+firstTenNumbers);
        
    }
}
