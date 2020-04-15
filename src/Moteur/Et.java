package Moteur;

import java.util.ArrayList;

public class Et extends FormuleBinaire {
    public Et(Formule oper1, Formule oper2) {
        super(oper1, oper2);
    }

    @Override
    public Formule toNNF() {
        return new Et(oper1.toNNF(), oper2.toNNF());
    }

    @Override
    public Formule toSousNNF() {
        return new Ou(new Non(oper1).toNNF(), new Non(oper2).toNNF());
    }

   /* @Override
    public Formule toDNF() {
        return ;
    }*/

    @Override
    public String toString() {
        return "(" + oper1 + " ∧ " + oper2 + ")";
    }



    @Override
    public boolean satisfait(ArrayList<Variable> listX) {
        return (oper1.satisfait(listX) && oper2.satisfait(listX)) ;
    }

    @Override
    public boolean isEt(){
        return true ;
    }

}
