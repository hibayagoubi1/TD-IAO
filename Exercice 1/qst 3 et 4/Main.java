public class Main {
    public static void main(String[] args) {
        Facture facture = new Facture(1);
        Produit produit1 = new Produit();
        produit1.setLibele("Produit 1");
        produit1.setPrix(100);

        Produit produit2 = new Produit();
        produit2.setLibele("Produit 2");
        produit2.setPrix(200);

        facture.addProduit(produit1, 2);
        facture.addProduit(produit2, 3);

        // Imprimer la facture
        FacturePrinter printer = new FacturePrinter();
        printer.imprimer(facture);

        // Sauvegarder la facture
        FactureSaver saver = new FactureSaver();
        saver.saveFacture(facture);
    }
}
