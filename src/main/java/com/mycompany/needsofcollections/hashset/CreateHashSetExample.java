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
public class CreateHashSetExample {
    public static void main(String[] args) {
        
        //Create a HashSet usign HashSet() constructor.
        //Add new elements to it using the add() method.
        
        
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C#");
        programmingLanguages.add("Java");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Lua");
        programmingLanguages.add("Python");
        programmingLanguages.add("CSS");
        
        System.out.println("");
    }
}
