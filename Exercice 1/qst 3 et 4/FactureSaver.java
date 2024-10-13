import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FactureSaver {
    public void saveFacture(Facture facture) {
        try {
            String file = "Facture" + facture.getId();
            FileWriter writer = new FileWriter(file);
            writer.write("Facture ID: " + facture.getId() + "\n");
            for (Map.Entry<Produit, Integer> mapentry : facture.getProduits().entrySet()) {
                writer.write(mapentry.getKey().toString() + "\t" + mapentry.getValue().toString() + "\n");
            }
            writer.write("Prix = " + facture.getTotal() + "\n");
            writer.write("Prix TTC = " + facture.getTotalTTC() + "\n");
            writer.close();
            System.out.println("Facture saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the facture.");
            e.printStackTrace();
        }
    }
}
