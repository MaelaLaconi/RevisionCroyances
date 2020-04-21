package Moteur;

public class Or extends FormuleBinaire {
    public Or(Formule oper1, Formule oper2) {
        super(oper1, oper2);
    }

    @Override
    public Formule toNNF() {
        return new Or(oper1.toNNF(), oper2.toNNF());
    }

    @Override
    public Formule toSousNNF() {
        return new And(new Not(oper1).toNNF(), new Not(oper2).toNNF());
    }

    @Override
    public boolean isOu(){
        return true ;
    }

    @Override
    public String toString() {
        return "("+oper1+" ∨ "+oper2+")";
    }

    public Formule toDNF() {
        return new Or(oper1.toDNF(), oper2.toDNF()) ;
    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        return (oper1.estSatisfaitePar(inter, variables) || oper2.estSatisfaitePar(inter, variables)) ;
    }

    @Override
    public Variables getVariables() {
        Variables variables1 = oper1.getVariables() ;
        Variables variables2 = oper2.getVariables() ;
        return variables1.union(variables2);
    }

}
