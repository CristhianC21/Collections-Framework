/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.linkedlist;

import java.util.LinkedList;

/**
 *
 * @author crist
 */


// add()
// add(2, element)
// addFirst() from Queue interface
// addLast()from Queue interface

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Apple");
        fruits.add("Raspberry");
        
        System.out.println("Initial LinkedList -> "+ fruits);
        
        // Adding an element at specific position
        fruits.add(2,"Watermelon");
        System.out.println("After adding Watermelon -> "+fruits);
        
        //Adding elemement at the beginning of LinkedList
        fruits.addFirst("Papaya"); 
        System.out.println("After adding Papaya -> "+fruits);

        //Adding elemement at the end of LinkedList
        fruits.addLast("Mango");
        System.out.println("After adding Mango -> "+fruits);

        
    }
}
