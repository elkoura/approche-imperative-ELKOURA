package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for (int valeu:array) {
			System.out.println(valeu );
			
		}
		for (int i=array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
            
		
		for (int element:array){
			 if (element > 3) {
	                System.out.println(element);
			 }
			 for (int i = 0; i < array.length; i++) {
				 if (array[i]%2==0) {
					 System.out.println(array[i]);
				
			}
				for (int j = 0; j < array.length; j++) {
					if (j % 2 ==0) {
						System.out.println("indeex" +j +":" + array[j]);
						
					}
					for (int k = 0; k < array.length; k++) {
						if (k%2!=0) {
							System.out.println("indeex" +k +":" + array[k]);

							
						}
					}
					
				}
					
				}
					
			}
		 }
				 
					
			}
		 
			
				 //if (element1 %2) {
		            //    System.out.println(element1);
				



