package Liskov;

public class Main {
    public static void main(String[] args) {
        MatriceYoung matrice = new MatriceYoung(3, 3);

        // Insérer des éléments
        matrice.inserer(1);
        matrice.inserer(2);
        matrice.inserer(3);
        matrice.inserer(4);
        matrice.inserer(5);
        matrice.inserer(6);
        matrice.inserer(7);
        matrice.inserer(8);

        // Afficher le tableau après insertion
        System.out.println("Tableau après insertion:");
        matrice.printTableau();

        // Extraire le minimum
        int min = matrice.extraireMin();
        System.out.println("Minimum extrait: " + min);

        // Afficher le tableau après extraction
        System.out.println("Tableau après extraction:");
        matrice.printTableau();
    }
}
