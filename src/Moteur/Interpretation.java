package Moteur;

public class Interpretation extends VariableValueTable {
    public Interpretation() {
    }

    public boolean satisfait(Formula formula){
        return formula.estSatisfaitePar(this, formula.getVariables()) ;
    }
}
