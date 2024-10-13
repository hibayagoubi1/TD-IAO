public class CompteUniversitaireEnseignant {
    private Enseignant enseignant;
    private String login;

    public CompteUniversitaireEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public void genererLogin() {
        GenerateurDeLogin generateur = new GenerateurDeLoginEnseignant(enseignant);
        this.login = generateur.genererLogin();
    }

    public String getLogin() {
        return login;
    }
}
