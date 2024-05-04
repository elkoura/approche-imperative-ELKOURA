package fr.tableaux;

public class Main {
    // Méthode pour modifier un élément du tableau
    public static void modifierElement(int[] tableau, int index, int nouvelleValeur) {
        if (index >= 0 && index < tableau.length) {
            tableau[index] = nouvelleValeur;
        } else {
            System.out.println("Index " + index + " hors limites. Aucune modification effectuée.");
        }
    }

    // Méthode pour afficher le tableau
    public static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println(); // Passer à la ligne suivante
    }

    public static void main(String[] args) {
        // Déclaration et initialisation du tableau
        int[] tableau = {10, 20, 30, 40, 50};

        // Affichage du tableau avant modification
        System.out.println("Avant modification: ");
        afficherTableau(tableau);

        // Tentative de modification de l'élément à l'index 2
        modifierElement(tableau, 2, 35);

        // Affichage du tableau après modification
        System.out.println("Après modification: ");
        afficherTableau(tableau);

        // Tentative de modification avec un index hors limite
        modifierElement(tableau, 10, 100);
    }
}
