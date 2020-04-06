package Moteur;

public abstract class Formule {
    protected Formule formuleUnaire ;
    protected String contrainte;
    protected Formule formuleUnaire2 ;

    public Formule(Formule formuleUnaire) {
        this.formuleUnaire = formuleUnaire;
    }

    public Formule(Formule formuleUnaire, Formule formuleUnaire2) {
        this.formuleUnaire = formuleUnaire;
        this.formuleUnaire2 = formuleUnaire2 ;
    }

    public Formule(String contrainte) {
        this.contrainte = contrainte;
    }

    @Override
    public String toString() {
        return "Formule{" +
                "formuleUnaire=" + formuleUnaire +
                ", var='" + contrainte + '\'' +
                ", formuleUnaire2=" + formuleUnaire2 +
                '}';
    }
}
