import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création d'une ArrayList de personnes
        ArrayList<Personne> personnes = new ArrayList<>();

        // Création des étudiants
        Etudiant etudiant1 = new Etudiant("Mbaye", "Tahir", 2000, "tahir.mbaye@isi.com", Classe.L3);
        Etudiant etudiant2 = new Etudiant("Wade", "Momat", 1999, "momat.wade@isi.com", Classe.M1);
        Etudiant etudiant3 = new Etudiant("Bodian", "Tra", 2000, "tra.bodian@isi.com", Classe.M2);

        // Ajout des étudiants à la liste de personnes
        personnes.add(etudiant1);
        personnes.add(etudiant2);
        personnes.add(etudiant3);

        // Création des professeurs
        Professeur professeur1 = new Professeur("LO", "Dane", 1975, "lo.dane@prof.com", "JAVA", "PHP");
        Professeur professeur2 = new Professeur("Kane", "Samba", 1980, "kane.samba@prof.com", "LARAVEL");

        // Ajout des professeurs à la liste de personnes
        personnes.add(professeur1);
        personnes.add(professeur2);

        // Affichage des informations de chaque objet dans la liste
        for (Personne personne : personnes) {
            System.out.println(personne.toString());
            if (personne instanceof Etudiant) {
                ((Etudiant) personne).sInscrire();
                ((Etudiant) personne).suivreCours();
                ((Etudiant) personne).passerExamen();
                personne.toString();
            } else if (personne instanceof Professeur) {
                ((Professeur) personne).enseigner();
                ((Professeur) personne).corrigerExamen();
            }
            System.out.println("------------------------------------------");
        }
    }
    }