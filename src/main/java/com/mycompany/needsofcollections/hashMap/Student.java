/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.hashMap;

/**
 *
 * @author crist
 */
public class Student {
    private String firstName;
    private String surname; 
    public Student(String firstName, String surname){
        super();
        this.firstName = firstName;
        this.surname = surname;
    }
    
    public String toString(){
        return "Student [firstName= "+firstName + ", surname= "+surname+ "]";
    }
    

}
