public class Etudiant extends Personne implements EtudiantInterface {
    private String numeroEtudiant;
    private Classe classe;

    public Etudiant(String nom, String prenom, int anneeNaissance, String email, Classe classe) {
        super(nom, prenom, anneeNaissance, email);
        this.classe = classe;
        this.numeroEtudiant = generateNumeroEtudiant();
    }

    private String generateNumeroEtudiant() {
        return nom + nom.length() + anneeNaissance + "000" + getId();
    }

    private int getId() {
        // Générer un ID d'étudiant simulé
        return (int) (Math.random() * 1000);
    }

    @Override
    public String toString() {
        return super.toString() + ", Numéro étudiant: " + numeroEtudiant + ", Classe: " + classe;
    }

   @Override
    public void sInscrire() {
        System.out.println("L'étudiant " + nom + " s'est inscrit.");
    }

    @Override
    public void suivreCours() {
        System.out.println("L'étudiant " + nom + " suit des cours.");
    }

    @Override
    public void passerExamen() {
        System.out.println("L'étudiant " + nom + " passe un examen.");
    }
}
