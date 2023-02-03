/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author crist
 */
public class SeachIterationLinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<String> brands = new LinkedList<>();
        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Polo");
        brands.add("Lacoste");
        brands.add("Lacoste");
        brands.add("Under Armour");
        
        System.out.println("LinkedList elements -> "+brands);
        
        //Check if a element is into LinkedList
        boolean result = brands.contains("Nike");
        System.out.println("Is Nike into ArrayList ->"+result);
                
        System.out.println("\nLinkedList elements -> "+brands);
        
        //Find the index of the first occurence of an element in LinkedList
        int index = brands.indexOf("Polo");
        System.out.println("Index od Polo element is "+index);
        
        System.out.println("\nLinkedList elements -> "+brands);
        //Find the index of the last occurence of an element in LinkedList
        int indexLast = brands.lastIndexOf("Lacoste");
        System.out.println("Index of Lacost element is "+indexLast);
     
        
        //iterator
        System.out.println("\n---ITERATOR class---");
        Iterator<String> iterator = brands.iterator();
        while(iterator.hasNext()){
            String string = (String) iterator.next();
            System.out.println(string);
        }
        
        //foreach
        System.out.println("\n---foreach lambda---");
        brands.forEach((element) -> {
            System.out.println(element); //lambda expression
        }); 
        
        //for each advanced loop    
        System.out.println("\n---For each advanced loop---");
        for(String e: brands){
            System.out.println(e);
        }
        
        //single for loop
        System.out.println("\n---For loop---");
        for(int i=0; i<brands.size();i++){
            System.out.println(brands.get(i));
        }
    }
}
