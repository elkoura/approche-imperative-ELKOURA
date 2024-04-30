package fr.algorithmie;

public class FirstLast6 {
	public static void main(String[] args) {
		int [] array= {1,3,58,4,32,6};
		 boolean result = array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);
	        System.out.println(result);
	    }
	
	
}
