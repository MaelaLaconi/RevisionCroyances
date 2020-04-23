package Moteur;

public class Or extends FormuleBinaire {
    public Or(Formule oper1, Formule oper2) {
        super(oper1, oper2);
    }

    @Override
    public Formule toNNF() {
        return new Or(leftChild.toNNF(), rightChild.toNNF());
    }

    @Override
    public Formule toSousNNF() {
        return new And(new Not(leftChild).toNNF(), new Not(rightChild).toNNF());
    }

    @Override
    public boolean isOu(){
        return true ;
    }

    @Override
    public String toString() {
        return "("+ leftChild +" ∨ "+ rightChild +")";
    }

    public Formule toDNF() {
        return new Or(leftChild.toDNF(), rightChild.toDNF()) ;
    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        return (leftChild.estSatisfaitePar(inter, variables) || rightChild.estSatisfaitePar(inter, variables)) ;
    }

    @Override
    public Variables getVariables() {
        Variables variables1 = leftChild.getVariables() ;
        Variables variables2 = rightChild.getVariables() ;
        return variables1.union(variables2);
    }

}
