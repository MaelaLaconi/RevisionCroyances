package Moteur;


public class And extends FormuleBinaire {
    public And(Formule leftChild, Formule rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public Formule toNNF() {
        return new And(leftChild.toNNF(), rightChild.toNNF());
    }

    @Override
    public Formule toSousNNF() {
        return new Or(new Not(leftChild).toNNF(), new Not(rightChild).toNNF());
    }


    @Override
    public String toString() {
        return "(" + leftChild + " ∧ " + rightChild + ")";
    }

    @Override
    public boolean isEt() {
        return true;
    }

    @Override
    public Variables getVariables() {
        Variables variables1 = leftChild.getVariables() ;
        Variables variables2 = rightChild.getVariables() ;
        return variables1.union(variables2);
    }

    @Override
    public Formule toDNF() {
        if (leftChild.isContrainte() && rightChild.isContrainte()) {
            return this;
        }
        if (leftChild.isContrainte() && rightChild.isOu()) {
            return new Or(new And(leftChild, rightChild.getLeftChild()), new And(leftChild, rightChild.getRightChild()));
        }

        if (rightChild.isContrainte() && leftChild.isOu()) {
            return new Or(new And(leftChild.getLeftChild(), rightChild), new And(leftChild.getRightChild(), rightChild));
        }

        if(leftChild.isOu() && rightChild.isOu()){
            And and1 = new And(leftChild.getLeftChild(), rightChild.getLeftChild()) ;
            And and2 = new And(leftChild.getLeftChild(), rightChild.getRightChild()) ;
            And and3 = new And(leftChild.getRightChild(), rightChild.getLeftChild()) ;
            And and4 = new And(leftChild.getRightChild(), rightChild.getRightChild()) ;
            return new Or(new Or(and1.toDNF(), and2.toDNF()), new Or(and3.toDNF(), and4.toDNF())) ;
        }
        return new And(leftChild.toDNF(), rightChild.toDNF()) ;
    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        return (leftChild.estSatisfaitePar(inter, variables) && rightChild.estSatisfaitePar(inter, variables));
    }


}
