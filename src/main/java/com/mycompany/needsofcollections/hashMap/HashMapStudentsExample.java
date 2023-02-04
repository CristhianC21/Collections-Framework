/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author crist
 */
public class HashMapStudentsExample {
    public static void main(String[] args) {
        
        //Create a hashMap
        Map<Integer, Student> students = new HashMap<Integer, Student>();
        
        
        students.put(1,new Student("Cristhian", "Canon"));
        students.put(2,new Student("Andrea", "Canon"));
        students.put(3,new Student("Claudia", "Pineda"));
        
        System.out.println(students.toString());
    }
}
