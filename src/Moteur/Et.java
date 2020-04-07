package Moteur;

public class Et extends FormuleBinaire {
    public Et(Formule oper1, Formule oper2) {
        super(oper1, oper2);
    }

    @Override
    public String toString() {
        return "(" + oper1 + " ∧ " + oper2 + ")";
    }

    @Override
    public void toFND(){
        oper1.toFND() ;
        oper2.toFND();
    }

}
