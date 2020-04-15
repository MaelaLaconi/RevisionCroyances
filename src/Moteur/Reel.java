package Moteur;

import java.util.ArrayList;

public class Reel extends Variable {

    public Reel(String nom) {
        super(nom);
    }

    @Override
    public Formule toNNF() {
        return this;
    }

    @Override
    public boolean satisfait(ArrayList<Variable> listX) {
        return true ;
    }

    @Override
    public double toDouble(){
        return Double.valueOf(nom) ;
    }
}
