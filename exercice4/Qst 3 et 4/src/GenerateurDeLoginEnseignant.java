public class GenerateurDeLoginEnseignant implements GenerateurDeLogin {
    private Enseignant enseignant;

    public GenerateurDeLoginEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    @Override
    public String genererLogin() {
        return this.enseignant.getPrenom() + this.enseignant.getNom() + this.enseignant.getGrade() + "@usms.ma";
    }
}
