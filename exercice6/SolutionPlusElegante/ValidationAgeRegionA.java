package SolutionPlusElegante;

public class ValidationAgeRegionA implements ValidationAgeRegles {
    @Override
    public boolean peutBoireAlcool(int age) {
        return age >= 19;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 13;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age >= 19;
    }
}
