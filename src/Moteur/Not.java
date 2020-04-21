package Moteur;

import java.util.ArrayList;

public class Not extends FormuleUnaire {
    public Not(Formule oper) {
        super(oper);
    }

    @Override
    public Formule toNNF() {
        if (oper.isContrainte()) {
            return this;
        } else {
            return oper.toSousNNF();
        }
    }

    @Override
    public boolean estContrainteNon() {
        return oper.isContrainte();
    }

    @Override
    public Variables getVariables() {
        return oper.getVariables();
    }
  /*  @Override
    public Formule toDNF() {
        return oper.toDNF();
    }*/

   /* @Override
    public boolean estSatisfaitePar(ArrayList<Variable> listX) {
        return !oper.estSatisfaitePar(listX);
    }*/

    @Override
    public String toString() {
        return "¬" + oper;
    }

    @Override
    public boolean isNon() {
        return true;
    }

    public Formule toDNF() {
        return this;
    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        return !oper.estSatisfaitePar(inter, variables);
    }
}
