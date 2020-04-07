package Moteur;

import java.util.ArrayList;

public class FormuleArite0 extends Formule {
    protected ArrayList<Variable> list ;
    protected double valeur ;


    public FormuleArite0(ArrayList<Variable> contrainte, double valeur) {
        super(contrainte, valeur);
        this.list = contrainte ;
        this.valeur = valeur ;
    }
}
