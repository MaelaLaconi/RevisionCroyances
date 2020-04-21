package Moteur;

import java.util.ArrayList;

public class And extends FormuleBinaire {
    public And(Formule oper1, Formule oper2) {
        super(oper1, oper2);
    }

    @Override
    public Formule toNNF() {
        return new And(oper1.toNNF(), oper2.toNNF());
    }

    @Override
    public Formule toSousNNF() {
        return new Or(new Not(oper1).toNNF(), new Not(oper2).toNNF());
    }

   /* @Override
    public Formule toDNF() {
        return ;
    }*/

    @Override
    public String toString() {
        return "(" + oper1 + " ∧ " + oper2 + ")";
    }


    /*@Override
    public boolean estSatisfaitePar(ArrayList<Variable> listX) {
        return (oper1.estSatisfaitePar(listX) && oper2.estSatisfaitePar(listX));
    }*/

    @Override
    public boolean isEt() {
        return true;
    }

    @Override
    public Variables getVariables() {
        Variables variables1 = oper1.getVariables() ;
        Variables variables2 = oper2.getVariables() ;
        return variables1.union(variables2);
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
            return new Or(new And(oper1, oper2.getOper1()), new And(oper1, oper2.getOper2()));
        }

        if (oper2.isContrainte() && oper1.isOu()) {
            return new Or(new And(oper1.getOper1(), oper2), new And(oper1.getOper2(), oper2));
        }

        if(oper1.isOu() && oper2.isOu()){
            And and1 = new And(oper1.getOper1(), oper2.getOper1()) ;
            And and2 = new And(oper1.getOper1(), oper2.getOper2()) ;
            And and3 = new And(oper1.getOper2(), oper2.getOper1()) ;
            And and4 = new And(oper1.getOper2(), oper2.getOper2()) ;
            return new Or(new Or(and1.toDNF(), and2.toDNF()), new Or(and3.toDNF(), and4.toDNF())) ;
        }


        return new And(oper1.toDNF(), oper2.toDNF()).toDNF() ;

    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        return (oper1.estSatisfaitePar(inter, variables) && oper2.estSatisfaitePar(inter, variables));
    }


}
