/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List allows you to duplicate elements
        list.add("HOla");
        list.add("HOla");
        System.out.println(list);
        
        //List alows you to have null elements
        list.add(null);
        list.add(null);
        System.out.println(list);
        
        List<String> listNumber = new ArrayList<>();

        //insetion order
        listNumber.add("number1");
        listNumber.add("number2");
        listNumber.add("number4");
        listNumber.add("number5");
        
        //access elements
        System.out.println(listNumber.get(0));
        System.out.println(listNumber.get(3));
        
        
    }
}
