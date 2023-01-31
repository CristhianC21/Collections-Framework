/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> f1Teams = new ArrayList<>();
        
        //Adding elements to ArrayList
        f1Teams.add("Mercedes"); //0
        f1Teams.add("Red Bull"); //1
        f1Teams.add("Ferrari"); //2
        f1Teams.add("McLaren"); //3
        f1Teams.add("Alfa Romeo"); //4
        f1Teams.add("Williams"); //5
        f1Teams.add("Haas"); //6
        
        System.out.println(f1Teams);
        
        //remove()
        f1Teams.remove(2);
        System.out.println("F1 team removed at index 2" + f1Teams);

        f1Teams.remove("Red Bull");
        System.out.println("F1 team removed at index 1" + f1Teams);

        //removeAll()
        //Remove items using a given Collection
        List<String> smallF1Teams = new ArrayList<>();
        smallF1Teams.add("Williams");
        smallF1Teams.add("Alfa Romeo");
        
        System.out.println("Small teams => "+ smallF1Teams);
        
        f1Teams.removeAll(smallF1Teams);
        System.out.println(f1Teams);
        
        //clear() erase all elements on the ArrayList
        f1Teams.clear();    
        System.out.println(f1Teams);
        
        
    }
}
