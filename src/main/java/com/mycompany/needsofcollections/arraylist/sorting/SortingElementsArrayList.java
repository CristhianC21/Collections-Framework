/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.needsofcollections.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author crist
 */
public class SortingElementsArrayList {

    public static void main(String[] args) {

        //Create a ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(30);
        numbers.add(60);
        numbers.add(31);
        System.out.println("Defult order: " + numbers);

        //Sorting ascending
        Collections.sort(numbers);
        System.out.println("Ascerding order: " + numbers);

        //Sorting descending Order
        Collections.reverse(numbers);
        System.out.println("descending order: " + numbers);

        //Implemeting a list with a Car class 
        //implementing comparator interface (class MySort)
        List<CarF1> carsList = new ArrayList<CarF1>();
        //  System.out.println(cars);
        carsList.add(new CarF1(1, "Juan Montoya", "BMW", 10));
        carsList.add(new CarF1(10, "Hamilton", "Mercedes", 100));
        carsList.add(new CarF1(6, "Verstappen", "Red Bull Racing", 50));

        Collections.sort(carsList, new MySort());
        System.out.println("\nSorting ascending through driver number (INTEGER)");
        System.out.println(carsList);

        //Implementing comparator without a class INTEGER
        Collections.sort(carsList, new Comparator<CarF1>() {
            @Override
            public int compare(CarF1 o1, CarF1 o2) {
                return (int) (o1.getDriverWins() - o2.getDriverWins());
            }
        });
        System.out.println("\nSorting ascending through driver wins (INTEGER)");
        System.out.println(carsList);

        //Sorting with lambda expressions
        Collections.sort(carsList, (o1, o2) -> (o2.getDriverScuderia().compareTo(o1.toString())));
        System.out.println("\nSorting ascending through driver wins (STRING)");
        System.out.println(carsList);
    }


}

class MySort implements Comparator<CarF1>{

    @Override
    public int compare(CarF1 o1, CarF1 o2) {
        return (int)(o1.getDriverNumber() - o2.getDriverNumber()); //ascending
        //return (int)(o2.getDriverNumber()-o1.getDriverNumber()); //descending
        
    }
    
}
