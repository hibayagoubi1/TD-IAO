public class Main {
    public static void main(String[] args) {
        // Test pour les enseignants
        Enseignant enseignant = new Enseignant("Hafidi", "Imad", "Professeur");
        CompteUniversitaireEnseignant compteEnseignant = new CompteUniversitaireEnseignant(enseignant);
        compteEnseignant.genererLogin();
        System.out.println("Login Enseignant : " + compteEnseignant.getLogin());

        // Test pour les étudiants
        Etudiant etudiant = new Etudiant("Hiba", "bounnit", 17);
        CompteUniversitaireEtudiant compteEtudiant = new CompteUniversitaireEtudiant(etudiant);
        compteEtudiant.genererLogin();
        System.out.println("Login Étudiant : " + compteEtudiant.getLogin());
    }
}

