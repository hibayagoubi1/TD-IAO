package Solution1;

public class TestValidationAge {
    public static void main(String[] args) {
        ValidationAge validation = new ValidationAge();

        // Test pour la France (FR)
        System.out.println("Peut boire en France à 18 ans : " + validation.peutBoireAlcool(18, "FR"));
        System.out.println("Peut être maire en France à 20 ans : " + validation.peutEtreEluMaire(20, "FR"));

        // Test pour une région différente
        System.out.println("Peut utiliser FesseBouk à 14 ans dans la REGION_A : " + validation.peutUtiliserFesseBouk(14, "REGION_A"));
        System.out.println("Peut être maire à 19 ans dans la REGION_A : " + validation.peutEtreEluMaire(19, "REGION_A"));
    }
}
