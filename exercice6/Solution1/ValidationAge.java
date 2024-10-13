package Solution1;

public class ValidationAge {
    public boolean peutBoireAlcool(int age, String region) {
        if (region.equals("FR")) {
            return age >= 18;
        } else if (region.equals("US")) {
            return age >= 21;
        } else if (region.equals("REGION_A")) {
            return age >= 19;
        } else {
            return age >= 14;  // Par défaut
        }
    }

    public boolean peutUtiliserFesseBouk(int age, String region) {
        if (region.equals("FR") || region.equals("REGION_A")) {
            return age >= 13;
        } else {
            return age >= 15;
        }
    }

    public boolean peutEtreEluMaire(int age, String region) {
        if (region.equals("FR")) {
            return age >= 21;
        } else if (region.equals("REGION_A")) {
            return age >= 19;
        } else {
            return age >= 18;  // Par défaut
        }
    }
}
