package fr.boucles;

public class ExerciceTableauEntier {
public static void main(String[] args) {
	int []tableau = {1,2,3,4,5,6,7,8,9,10,11};
	for (int i = 1; i < tableau.length; i++) {
		System.out.println(tableau[0]);
		System.out.println(tableau.length);
		System.out.println(tableau.length-1);
	    tableau[4]=110;
	    for (int valeur :tableau) {
		System.out.println(valeur + " ");
		
	
	    }
	}
	System.out.println(tableau[0]);
	System.out.println(tableau.length);
	System.out.println(tableau.length-1);

	
	
}
}
