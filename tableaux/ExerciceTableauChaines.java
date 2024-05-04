package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  [] array= new String[] {"rabat", "casablanca", "fes" , "oujda", "agadir"};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array [i] );
			for (String value : array) {
			System.out.println(value + " ");
			}
			array[3]="marakasg";
			System.out.println("\nAprès modification: ");
			for (String value : array) {
				System.out.println(value + " ");
				}
			

		}
		System.out.println("la longeur est :" + array.length);
	
	

	}

}
