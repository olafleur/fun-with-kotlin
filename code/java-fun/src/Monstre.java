public class Monstre {
    private String nom;
    private int grandeur;
    private double energie;

    public Monstre(String nom, int grandeur, double energie) {
        this.nom = nom;
        this.grandeur = grandeur;
        this.energie = energie;
    }

    public boolean energiePlusPetit() {
        return this.energie < this.grandeur;
    }

    @Override
    public String toString() {
        return "Monstre{" +
                "nom='" + nom + '\'' +
                ", grandeur=" + grandeur +
                ", energie=" + energie +
                '}';
    }
}
