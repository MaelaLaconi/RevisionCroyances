package Moteur;

import java.util.ArrayList;

public class Entier extends Variable {

    public Entier(String nom) {
        super(nom);
    }

    @Override
    public Formule toNNF() {
        return this;
    }

    @Override
    public boolean satisfait(ArrayList<Variable> listX) {
        return true;
    }

    @Override
    public int toInt(){
        return Integer.valueOf(nom) ;
    }
}
