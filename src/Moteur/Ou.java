package Moteur;

public class Ou extends FormuleBinaire {
    public Ou(Formule oper1, Formule oper2) {
        super(oper1, oper2);
    }

    @Override
    public String toString() {
        return "("+oper1+" ∨ "+oper2+")";
    }
}
