package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;
        do {
            System.out.print("Entrez un nombre entre 1 et 10: ");
            nb = scanner.nextInt();
        } while (nb < 1 || nb > 10);

        System.out.println("Table de " + nb + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + (nb * i));
        }
        scanner.close();
    }
}
