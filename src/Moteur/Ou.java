package Moteur;

import java.util.ArrayList;

public class Ou extends FormuleBinaire {
    public Ou(Formule oper1, Formule oper2) {
        super(oper1, oper2);
    }

    @Override
    public Formule toNNF() {
        return new Ou(oper1.toNNF(), oper2.toNNF());
    }

    @Override
    public Formule toSousNNF() {
        return new Et(new Non(oper1).toNNF(), new Non(oper2).toNNF());
    }

    @Override
    public boolean isOu(){
        return true ;
    }
    /*@Override
    public Formule toDNF() {
        return this ;
    }*/

    @Override
    public boolean satisfait(ArrayList<Variable> listX) {
        return (oper1.satisfait(listX) || oper2.satisfait(listX)) ;
    }

    @Override
    public String toString() {
        return "("+oper1+" ∨ "+oper2+")";
    }
}
