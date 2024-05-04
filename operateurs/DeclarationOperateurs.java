package fr.operateurs;

/**
 * 
 */
public class DeclarationOperateurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =-1;
		int b=20;
		boolean testEt= a>0 && b<10;
		System.out.println(testEt);
		boolean testOu = a>0 || b<10;
		System.out.println(testOu);
		a=a+1;
		System.out.println(a);// somme a+1
		a++;
		System.out.println(a);//incrementer de 1 
		a+=1;
		System.out.println(a);
		String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";
		System.out.println(c);



		
	}

}
