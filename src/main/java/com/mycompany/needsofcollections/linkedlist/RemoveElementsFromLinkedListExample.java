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

// How to remove the first element of Linked List . Queue implements
// How to remove the last element of Linked List. Queue implements
// How to remove the first occurence of given  element in the Linked List
// How to clear linkedList completely

public class RemoveElementsFromLinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<String> footballTeams = new LinkedList<>();
        footballTeams.add("Barcelona");
        footballTeams.add("Real Madrid");
        footballTeams.add("Bayern Munich");
        footballTeams.add("PSG");
        footballTeams.add("Boca Juniors");
        
        System.out.println("LinkedList footballTeams -> "+footballTeams);
    
        //Remove first element of Linked List
        String firstElement = footballTeams.removeFirst();
        System.out.println("After removing first element -> "+footballTeams);
        
        //Remove last element of Linked List
        String lastElement = footballTeams.removeLast();
        System.out.println("After removing last element -> "+footballTeams);
        
        //Remove element by its name
        footballTeams.remove("PSG");
        System.out.println("After removing 'PSG' element -> "+footballTeams);
        
        //Remove LinkedList completely.
        footballTeams.clear();
        System.out.println("After clear LinkedList -> "+footballTeams);
    }
}
