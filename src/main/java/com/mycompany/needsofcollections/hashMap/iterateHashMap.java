/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author crist
 */
//Different Ways to iterate over HashMap
public class iterateHashMap {
    public static void main(String[] args) {
        Map<String, Integer> driversWins = new HashMap<>();
        driversWins.put("Hamilton", 103);
        driversWins.put("Schumacher", 91);
        driversWins.put("Vettel", 53);
        driversWins.put("Prost", 51);
        driversWins.put("Senna", 41);
        
        
        //for each method
        System.out.println("for each method");
        for(Map.Entry<String, Integer> entry: driversWins.entrySet()){
            System.out.println("Driver: " + entry.getKey() + " Wins: "+ entry.getValue());
        }
        
        //using iterator
        System.out.println("\nusing iterator");
        
        Set<Map.Entry<String, Integer>> entries = driversWins.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Driver: " + entry.getKey() + " Wins: "+ entry.getValue());
        }
        
        // hashMap using java8 forEach
        System.out.println("\nhashMap using java8 forEach");

        driversWins.forEach((K, V)->{
            System.out.print(" Driver: "+ K);
            System.out.println(" Wins: "+ V);
        
        });
        
    }
}
