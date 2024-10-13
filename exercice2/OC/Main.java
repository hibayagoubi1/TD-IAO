package OC;

public class Main {
    public static void main(String[] args) {

        Compte compteCourant = new CompteCourant("CC001", "01/01/2022");
        Compte compteEpargne = new CompteEpargne("CE001", "01/01/2022");

        Operation operation1 = new Operation(1000, TypeOperation.Credit);
        Operation operation2 = new Operation(500, TypeOperation.Debit);
        Operation operation3 = new Operation(200, TypeOperation.Credit);
        Operation operation4 = new Operation(150, TypeOperation.Debit);

        System.out.println("Ajout d'opérations au compte courant :");
        compteCourant.addOperation(operation1);
        compteCourant.addOperation(operation2);

        System.out.println("Ajout d'opérations au compte épargne :");
        compteEpargne.addOperation(operation3);
        compteEpargne.addOperation(operation4);

        // Affichage des résultats
        System.out.println("Montant du compte courant : " + compteCourant.getMontant());
        System.out.println("Opérations du compte courant : " + compteCourant.getOperations());

        System.out.println("Montant du compte épargne : " + compteEpargne.getMontant());
        System.out.println("Opérations du compte épargne : " + compteEpargne.getOperations());
    }
}
