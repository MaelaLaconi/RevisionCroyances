package Moteur;

import java.util.ArrayList;

public class Interpretation {
    protected ArrayList<Variable> listX ;
    public Interpretation(ArrayList<Variable> listX) {
        this.listX = listX ;
    }

    public boolean satisfait(Formule formule){
        return formule.satisfait(listX) ;
    }
}
