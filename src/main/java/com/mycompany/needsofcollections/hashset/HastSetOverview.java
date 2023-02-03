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
public class HastSetOverview {
    public static void main(String[] args) {
        nullValue();
        duplicateValue();
        unorderedValue();
    }
    
    //Set can contain one null value
    public static void nullValue(){ 
        System.out.println("");
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        //displays only one element
        System.out.println(set);
    }
    
    //It is not contain duplicate elements
    public static void duplicateValue() {
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element1");
        System.out.println(set);
    }
    
    //It is unordered collection
    public static void unorderedValue() {
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");
        set.add("Element5");
        set.add("Element10");
        set.add("Element6");
        System.out.println(set);
    }
    
    
    
}
