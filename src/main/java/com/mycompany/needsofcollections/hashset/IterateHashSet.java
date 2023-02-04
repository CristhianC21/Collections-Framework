/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author crist
 */
public class IterateHashSet {
    public static void main(String[] args) {
        Set<String> programmingLanguage = new HashSet<>();
        programmingLanguage.add("Java");
        programmingLanguage.add("C#");
        programmingLanguage.add("C++");
        programmingLanguage.add("Python");
        programmingLanguage.add("JavaScript");
        
        //Enhaced for loop
        System.out.println("Enhaced for loop");
        for(String prog:programmingLanguage){
            System.out.println(prog);
        }
        
        //Basic loop with iterator
        System.out.println("\nBasic loop with iterator");        
         for(Iterator<String> iterator = programmingLanguage.iterator(); iterator.hasNext();){
             String course = (String) iterator.next();
             System.out.println(course);
         }
         
         //While loop iterator
        System.out.println("\nWhile loop iterator");         
         Iterator<String> iterator = programmingLanguage.iterator();
         while(iterator.hasNext()){
             String course = (String) iterator.next();
             System.out.println(course);
         }
     
         //JDK 8 forEach() method With lambda
         System.out.println("\nJDK 8 forEach() method With lambda");
         programmingLanguage.forEach( prog -> System.out.println(prog));
     
         //JDK 8 streaming + forEach() + lambda expression
         System.out.println("\nJDK 8 streaming + forEach() + lambda expression");
         programmingLanguage.stream().filter(prog -> !"Java".equals(prog)).forEach(prog -> System.out.println(prog));
    }
}
