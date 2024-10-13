public class GenerateurDeLoginEtudiant implements GenerateurDeLogin {
    private Etudiant etudiant;

    public GenerateurDeLoginEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public String genererLogin() {
        return this.etudiant.getPrenom().charAt(0) + this.etudiant.getNom() + "@usms.ac.ma";
    }
}
