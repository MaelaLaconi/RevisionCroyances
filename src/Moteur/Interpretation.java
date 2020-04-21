package Moteur;

import java.util.ArrayList;

public class Interpretation extends VariableValueTable {
    protected ArrayList<Variable> listX ;
    public Interpretation() {
    }

    public boolean satisfait(Formule formule){
        System.out.printf("varibles : " + formule.getVariables());
        return formule.estSatisfaitePar(this, formule.getVariables()) ;
    }
}
