package Moteur;

public abstract class Formula {
    protected Formula child;
    protected Coefficients coefficients ;
    protected double rightMember;
    protected Formula child2;

    public Formula(Formula child) {
        this.child = child;
    }

    /**
     * constructor for binary formula
     * @param child
     * @param child2
     */
    public Formula(Formula child, Formula child2) {
        this.child = child;
        this.child2 = child2;
    }

    /**
     * constructor for constraint
     * @param coefficients
     * @param rightMember
     */
    public Formula(Coefficients coefficients, double rightMember) {
        this.coefficients = coefficients;
        this.rightMember = rightMember;
    }



    /**
     * Negative Normal Form
     * @return Formula
     */
    public abstract Formula toNNF() ;

    public Formula toSousNNF(){
        return this ;
    }

    /**
     * Disjunctive Normal Form
     * @return Formula
     */
    public abstract Formula toDNF() ;

    /**
     *
     * @param inter
     * @param variables
     * @return true if phi is satisfy by inter, false if not
     */
    public abstract boolean estSatisfaitePar(Interpretation inter, Variables variables) ;

    /**
     *
     * @return true is phi is a constraint, false otherwise
     */
    public boolean isConstraint(){return false;}

    /**
     *
     * @return true is phi is a Or, false otherwise
     */
    public boolean isOr(){return false;}


    public boolean isEt(){return false;}

    public boolean isNon(){return false;}
    public boolean estContrainteNon(){
        return false ;
    }

    /**
     * get the left child of a binary formula
     * @return Formula
     */
    public Formula getLeftChild() {
        return child;
    }

    /**
     * get the right child of a binary formula
     * @return Formula
     */
    public Formula getRightChild() {
        return child2;
    }


    public abstract Variables getVariables() ;
}
