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
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
         List<String> programmingLanguages = new ArrayList<>();
        
          //Check if ArrayList is empty or not
         System.out.println("is programmingLanguages ArrayList is empty => "+ programmingLanguages.isEmpty());

         programmingLanguages.add("Java"); //0
         programmingLanguages.add("C#"); //1
         programmingLanguages.add("Python"); //2
         programmingLanguages.add("JavaScript"); //3
         
         //Find Size of ArrayList
         System.out.println("Size of programmingLanguages ArrayList "+ programmingLanguages.size());
         
         //Retrieve an element of ArrayList
         System.out.println("Element position 0 => "+ programmingLanguages.get(0));
         System.out.println("Element position 3 => "+ programmingLanguages.get(3));
         
         //Modify an element at given index
         //From "C#" converts to "C+="
         programmingLanguages.set(2, "C++");
    }
}
