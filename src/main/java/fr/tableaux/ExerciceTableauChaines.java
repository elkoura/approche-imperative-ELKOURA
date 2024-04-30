package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] cities = {"rabat", "fes", "casablanca", "ouajda", "asila", "tanger", "safi", "ouarzatat"};

       
        for(int i = 0; i < 5; i++) {
            System.out.println(cities[i]);
        }

        // Display the length of the array
        System.out.println("Length of array: " + cities.length);

        // modifier index 3
        cities[3] = "Reims";

     
        System.out.println("Array after modification: " + Arrays.toString(cities));
        System.out.println();
    }
}
