import java.util.Map;

public class FacturePrinter {
    public void imprimer(Facture facture) {
        double prix;
        for (Map.Entry<Produit, Integer> mapentry : facture.getProduits().entrySet()) {
            prix = mapentry.getKey().getPrix() * mapentry.getValue();
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " + prix);
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("Prix TTC = " + facture.getTotalTTC());
    }
}

