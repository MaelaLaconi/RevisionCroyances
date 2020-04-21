package Moteur;

import java.util.ArrayList;

public abstract class Formule {
    protected Formule formuleUnaire ;
    protected Coefficients coefficients ;
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

    public Formule(Coefficients coefficients, double valeur) {
        this.coefficients = coefficients;
        this.valeur = valeur ;
    }

    public Formule(String nom) {
        this.nom = nom ;
    }

   // public abstract Formule toDNF();

    /**
     * NegativeNormalForm
     * @return
     */
    public abstract Formule toNNF() ;

    public  Formule toSousNNF(){
        return this ;
    }

    public Formule toDNF(){
        return this ;
    }
    public abstract boolean estSatisfaitePar(Interpretation inter, Variables variables) ;

    public boolean isContrainte(){return false;}
    public boolean isOu(){return false;}
    public boolean isEt(){return false;}

    public boolean isNon(){return false;}
    public boolean estContrainteNon(){
        return false ;
    }

    public Formule getOper1() {
        return formuleUnaire;
    }

    public Formule getOper2() {
        return formuleUnaire2;
    }


    public abstract Variables getVariables() ;
}
