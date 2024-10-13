package SolutionPlusElegante;

public class ValidationAgeTest {
    public static void main(String[] args) {
        ValidationAge validationFrance = new ValidationAge(new ValidationAgeFrance());
        System.out.println("Peut boire en France à 18 ans : " + validationFrance.peutBoireAlcool(18));

        ValidationAge validationRegionA = new ValidationAge(new ValidationAgeRegionA());
        System.out.println("Peut être maire dans REGION_A à 19 ans : " + validationRegionA.peutEtreEluMaire(19));
    }
}
