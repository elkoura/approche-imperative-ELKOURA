package fr.algorithmie;

import java.util.Scanner;
public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
            System.out.print("Entrez un nombre: ");
            nb = scanner.nextInt();
       
        for (int i = 1; i <= 10; i++) {
        	System.out.print((nb + i) + (i < 10 ? ", " : ""));        
        }
        scanner.close();
    }
}