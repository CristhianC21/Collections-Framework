/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author crist
 */
public class CreateHashMapExample {

    public static void main(String[] args) {
        //example to map numbers to String
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("ONE", 1);
        numberMapping.put("TWO", 2);
        numberMapping.put("THREE", 3);
        numberMapping.put("FOUR", 4);
        numberMapping.put("FIVE", 5);

        System.out.println(numberMapping);
        
        //check if a HashMap is empty
        System.out.println("Is HashMap empty -> "+numberMapping.isEmpty());
        
        //Check HashMap size
        System.out.println("HashMap size -> "+numberMapping.size());
        
        //Check if a key exists in the HashMap
        System.out.print("Is key FOUR in the HashMap? ");
        if(numberMapping.containsKey("FOUR")){
            System.out.println("True");
        }else{
            System.out.println("Else");
        }

        //Check if a value exists in the HashMap
        System.out.print("Is value 10 in the HashMap? ");
        if(numberMapping.containsValue(10)){
            System.out.println("True");
        }else{
            System.out.println("Else");
        }
        
        //Get value by key
        Integer v1 = numberMapping.get("THREE");
        System.out.println(v1);
        
        //How to remove keys from HashMap
        numberMapping.remove("FIVE");
        System.out.println(numberMapping);
        
        //Get only keys from HashMap
       
        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);
        
        Collection<Integer> values = numberMapping.values();
        System.out.println(values);
        
    }
}
