package Moteur;

public class Constraint extends FormuleArite0{
    public Constraint(Coefficients coefficients, double valeur) {
        super(coefficients, valeur);
    }

    @Override
    public Formule toNNF() {
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
    public boolean isContrainte() {
        return true;
    }

    @Override
    public Variables getVariables() {
        return coefficients.getVariables();
    }

    @Override
    public Formule toDNF() {
        return this ;
    }

    @Override
    public String toString() {
        return  "("+coefficients + " ≤ "+ rightMember +")" ;
    }
}
