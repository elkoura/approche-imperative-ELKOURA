package fr.algorithmie;

public class Rotation {
	public static void main(String[] args) {
		int [] array= {2,3,4,5};
		int LastElement=array[array.length-1];
		for(int i=array.length-1; i>0;i--) {
			array[i]=array[i-1];
		}
		array[0]=LastElement;
		for (int element:array) {
			System.out.println(element + " ");
		}
		
		
	}
	
}
