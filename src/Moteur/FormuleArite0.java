package Moteur;

import java.util.ArrayList;

public abstract class FormuleArite0 extends Formule {
    protected ArrayList<Variable> list ;
    protected double valeur ;
    protected String nom ;


    public FormuleArite0(ArrayList<Variable> contrainte, double valeur) {
        super(contrainte, valeur);
        this.list = contrainte ;
        this.valeur = valeur ;
    }

    public FormuleArite0(String nom) {
        super(nom);
        this.nom = nom ;
    }

    @Override
    public String toString() {
        return nom;
    }
}
