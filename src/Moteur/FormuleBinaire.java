package Moteur;

public class FormuleBinaire extends Formule {
    protected Formule oper1 ;
    protected Formule oper2 ;

    public FormuleBinaire(Formule oper1, Formule oper2) {
        super(oper1, oper2);
        this.oper1 = oper1;
        this.oper2 = oper2;
    }
}
