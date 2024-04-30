package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez 10 nombres:");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Le plus grand nombre est: " + max);
        scanner.close();
    }
}
