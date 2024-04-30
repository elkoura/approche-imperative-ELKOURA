package fr.algorithmie;

public class AffichagePartiel {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 for (int number : array) {
	            if (number > 3) {
	                System.out.println(number);
	            }
	        }

	        
	        for (int number : array ) {
	            if (number % 2 == 0) {
	                System.out.println(number);
	            }
	        }
	        for (int i=0; i < array.length; i++ ) {
	            if (i % 2 == 0) {
	            	System.out.println("index paire");
	                System.out.println(array[i]);
	            }
	        }
	        for (int number: array ) {
	            if (number %2!= 0) {
	                System.out.println("odd " +number);
	            }
	        }


	}
}
