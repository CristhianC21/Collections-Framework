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


// How to get first element in the LinkedList . (Queue implements)
// How to get last element in the LinkedList . (Queue implements)s
// How to get a element at a given index in the LinkedList
// How to get all elements in the LinkedList

public class RetrieveLinkedListElements {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Dolphin");
        System.out.println("LinkedList -> "+animals);
        
        //Getting first element of a list using getFirst()
        String getFirst = animals.getFirst();
        System.out.println("First element -> "+getFirst);
        
        //Getting last element of a list using getLast()
        String getLast = animals.getLast();
        System.out.println("Last element -> "+getLast);
        
        //Getting element at given position in the LinkedList
        String elementXPos = animals.get(2);
        System.out.println("element -> "+elementXPos);
        
        //Getting all elements of LinkedList
        for(String animal:animals){
            System.out.println(animal);
        }
        
        
        
    }
}
