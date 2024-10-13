public class CompteUniversitaireEtudiant {
    private Etudiant etudiant;
    private String login;

    public CompteUniversitaireEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void genererLogin() {
        GenerateurDeLogin generateur = new GenerateurDeLoginEtudiant(etudiant);
        this.login = generateur.genererLogin();
    }

    public String getLogin() {
        return login;
    }
}
