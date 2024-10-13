package SolutionPlusElegante;

public class ValidationAge {
    private ValidationAgeRegles regles;

    public ValidationAge(ValidationAgeRegles regles) {
        this.regles = regles;
    }

    public boolean peutBoireAlcool(int age) {
        return regles.peutBoireAlcool(age);
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return regles.peutUtiliserFesseBouk(age);
    }

    public boolean peutEtreEluMaire(int age) {
        return regles.peutEtreEluMaire(age);
    }
}

