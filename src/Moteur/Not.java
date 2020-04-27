package Moteur;

public class Not extends UnaryFormula {
    public Not(Formula oper) {
        super(oper);
    }

    @Override
    public Formula toNNF() {
        if (child.isConstraint()) {
            return this;
        } else {
            return child.toSousNNF();
        }
    }

    @Override
    public boolean estContrainteNon() {
        return child.isConstraint();
    }

    @Override
    public Variables getVariables() {
        return child.getVariables();
    }

    @Override
    public String toString() {
        return "¬" + child;
    }

    @Override
    public boolean isNon() {
        return true;
    }

    public Formula toDNF() {
        return this;
    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        return !child.estSatisfaitePar(inter, variables);
    }


    /**
     *
     * @return true if not(constraint), false if not
     */
    @Override
    public boolean isConstraint(){
        return this.child.isConstraint();
    }
}
