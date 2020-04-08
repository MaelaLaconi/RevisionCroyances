package Moteur;

import java.util.ArrayList;

public abstract class Formule {
    protected Formule formuleUnaire ;
    protected ArrayList<Variable> contrainte;
    protected double valeur ;
    protected Formule formuleUnaire2 ;
    protected String nom ;

    public Formule(Formule formuleUnaire) {
        this.formuleUnaire = formuleUnaire;
    }

    public Formule(Formule formuleUnaire, Formule formuleUnaire2) {
        this.formuleUnaire = formuleUnaire;
        this.formuleUnaire2 = formuleUnaire2 ;
    }

    public Formule(ArrayList<Variable> contrainte, double valeur) {
        this.contrainte = contrainte;
        this.valeur = valeur ;
    }

    public Formule(String nom) {
        this.nom = nom ;
    }

   // public abstract Formule toDNF();

    public abstract boolean satisfait(ArrayList<Variable> listX) ;
}
