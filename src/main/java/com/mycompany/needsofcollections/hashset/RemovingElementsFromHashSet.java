/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author crist
 */

//remove() method. Remove an element from a HashSet.
//removeAll() method. Remove all elements that exist in a given collection from the HashSet.
//clear() method. Clear the HashSet completely by removing all the elements.

public class RemovingElementsFromHashSet {
    public static void main(String[] args) {
        
        //Creating HashSet
        Set<Integer> tenNumbers = new HashSet<>();
        tenNumbers.add(1);
        tenNumbers.add(2);
        tenNumbers.add(3);
        tenNumbers.add(4);
        tenNumbers.add(5);
        tenNumbers.add(6);
        tenNumbers.add(7);
        tenNumbers.add(8);
        tenNumbers.add(9);
        tenNumbers.add(10);
        
        System.out.println("TenNumbers HashSet -> "+ tenNumbers);
        
        //using remove() method
        boolean removeSpe = tenNumbers.remove(1);
        System.out.println("remove 1 method result -> "+ removeSpe);
        System.out.println("TenNumbers HashSet after removing-> "+ tenNumbers);
   
        //using removeAll() method
        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        
        tenNumbers.removeAll(evenNumbers);
        System.out.println("\nAfter removing even numbers -> "+ tenNumbers);
    
        //clear()
        tenNumbers.clear();
        System.out.println(tenNumbers);
    }
}
