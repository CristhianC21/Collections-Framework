/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author crist
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Apple"); 
        fruitCollection.forEach((element) -> {
            System.out.println(element);});
    }
    
}
