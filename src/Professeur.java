import java.util.HashSet;
import java.util.Set;

public class Professeur extends Personne implements ProfesseurInterface{
    private Set<String> specialite = new HashSet<>();

    public Professeur(String nom, String prenom, int anneeNaissance, String email, String... specialites) {
        super(nom, prenom, anneeNaissance, email);
        this.specialite.addAll(Set.of(specialites));
    }

    @Override
    public String toString() {
        return super.toString() + ", Spécialités: " + specialite;
    }

   @Override
    public void enseigner() {
        System.out.println("Le professeur " + nom + " enseigne.");
    }

    @Override
    public void corrigerExamen() {
        System.out.println("Le professeur " + nom + " corrige un examen.");
    }
}
