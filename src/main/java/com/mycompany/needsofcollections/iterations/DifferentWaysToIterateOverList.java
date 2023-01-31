/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.iterations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author crist
 */
public class DifferentWaysToIterateOverList {
    public static void main(String[] args) {
        //ArrayList Creation
        List<String> lectures = Arrays.asList("Mathematics","Physics","Ethics");

        //basic for loop
        System.out.println("1.Basic For Loop");
        for(int i=0;i<lectures.size();i++){
            System.out.println(lectures.get(i));
        }
        
        //Enhanced for loop
        System.out.println("\n2 .Enhanced for loop");
        for(String lecture:lectures){
            System.out.println(lecture);
        }
        
        //basic loop with iterator
        System.out.println("\n3.loop with iterator ");
        for(Iterator iterator = lectures.iterator(); iterator.hasNext();){
            String lecture = (String) iterator.next(); //casting
            System.out.println(lecture);
        }
        
        //iterator with while loop
        System.out.println("\4.Iterator with while loop");
        Iterator iterator = lectures.iterator();
        while(iterator.hasNext()){ //Check if there is another element in the ArrayList 
            String lecture = (String) iterator.next(); //casting
            System.out.println(lecture);
        }
        
        //java8 stream with lambda
        System.out.println("\n5.java 8 stream + lambda");
        lectures.stream().forEach(lecture -> System.out.println(lecture));
        
        //java8 foreach with lambda
        System.out.println("\n6.java8 foreach + lambda");

        lectures.forEach((lecture -> System.out.println(lecture)));
    }
}
