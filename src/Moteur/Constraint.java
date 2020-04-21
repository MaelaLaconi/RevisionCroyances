package Moteur;

import java.util.ArrayList;

public class Constraint extends FormuleArite0{

    //pas utiliser arraylist 3 6 <= 7  x1--xn variable
    // 3 6 / 7 double   class coef pour 3-6  (wrapper)
    // x1 x2 variable


    //2x1-4x3 <= 12
    //table de hachage (2,x1) class VariableValueTable  avec sous classe  coefficients
    //**********************************************************
    //(coef, 12) avec x1, x3 var globale  --> bon
    //12 right

    //interpretatation -> affectation variable par valeur entier ou reel selon le type (sous class VariableValueTable)
    //a satisfait inter.satisfaitPhi fait phi.estSatisfaitPar(interp)
    // inter.satisfait(phi, vars) vars -> type Variables
    //= phi.estStaisfaitPar(interp, vars)


    //class Variables avec un iterateur

    public Constraint(Coefficients coefficients, double valeur) {
        super(coefficients, valeur);
    }

    @Override
    public String toString() {
        return  "("+coefficients + " ≤ "+valeur+")" ;
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
       /* double res = list.get(0).toDouble() + listX.get(0).toDouble();
        int i ;

        for(i=1; i<list.size(); i++){
            res += list.get(i).toDouble() + listX.get(i).toDouble();
        }
        return (res <=valeur);*/
        return (res <=valeur) ;
    }


    //estSatisfaitePar(phi, vars)



    @Override
    public boolean isContrainte() {
        return true;
    }

    @Override
    public Variables getVariables() {
        return coefficients.getVariables();
    }

    public Formule toDNF() {
        return this ;
    }


}
