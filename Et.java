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
        return (oper1.satisfait(listX) && oper2.satisfait(listX));
    }

    @Override
    public boolean isEt() {
        return true;
    }

    public Formule toDNF() {
        if (oper1.isContrainte() && oper2.isContrainte()) {
            return this;
        }

       /* if (oper1.isEt() && oper2.isEt()){
            return new Et(oper1.toDNF(), oper2.toDNF()).toDNF() ;
        }
        if (oper1.isContrainte() && oper2.isEt()) {
            return new Et(oper1, oper2.toDNF()).toDNF();
        }
        if (oper2.isContrainte() && oper1.isEt()) {
            return new Et(oper1.toDNF(), oper2).toDNF();
        }*/
        if (oper1.isContrainte() && oper2.isOu()) {
            return new Ou(new Et(oper1, oper2.getOper1()), new Et(oper1, oper2.getOper2()));
        }

        if (oper2.isContrainte() && oper1.isOu()) {
            return new Ou(new Et(oper1.getOper1(), oper2), new Et(oper1.getOper2(), oper2));
        }

        if(oper1.isOu() && oper2.isOu()){
            Et et1 = new Et(oper1.getOper1(), oper2.getOper1()) ;
            Et et2 = new Et(oper1.getOper1(), oper2.getOper2()) ;
            Et et3 = new Et(oper1.getOper2(), oper2.getOper1()) ;
            Et et4 = new Et(oper1.getOper2(), oper2.getOper2()) ;
            return new Ou(new Ou(et1.toDNF(), et2.toDNF()), new Ou(et3.toDNF(), et4.toDNF())) ;
        }


        return new Et(oper1.toDNF(), oper2.toDNF()).toDNF() ;

    }


    }
