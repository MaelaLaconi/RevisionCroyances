package Moteur;

import java.util.ArrayList;

public abstract class FormuleArite0 extends Formule {
    protected Coefficients coefficients ;
    protected double valeur ;
    protected String nom ;


    public FormuleArite0(Coefficients coefficients, double valeur) {
        super(coefficients, valeur);
        this.coefficients = coefficients ;
        this.valeur = valeur ;
    }

    @Override
    public String toString() {
        return nom;
    }
}
