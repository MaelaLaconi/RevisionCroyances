package Moteur;

public class Constraint extends FormuleArite0{
    public Constraint(Coefficients coefficients, double rightMember) {
        super(coefficients, rightMember);
    }

    @Override
    public Formula toNNF() {
        return this;
    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        double res = 0 ;
        for(Object v : variables){
            Variable var = (Variable)v ;
            res += inter.get(var) * coefficients.get(var) ;
        }
        return (res <= rightMember) ;
    }

    @Override
    public boolean isConstraint() {
        return true;
    }

    @Override
    public Variables getVariables() {
        return coefficients.getVariables();
    }

    @Override
    public Formula toDNF() {
        return this ;
    }

    @Override
    public String toString() {
        return  "("+coefficients + " ≤ "+ rightMember +")" ;
    }
}
