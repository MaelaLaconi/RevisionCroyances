package Moteur;

public abstract class Variable {

    protected int entier ;
    protected double reel ;

    protected Variable(int n) {
        this.entier = n;
    }
    protected Variable(double n) {
        this.reel = n;
    }

    /*public String toString() {
        return this.nom;
    }*/
}
