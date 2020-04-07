package Moteur;

public class FormuleUnaire extends Formule {
    protected Formule oper ;

    public FormuleUnaire(Formule oper) {
        super(oper);
        this.oper = oper;
    }



}
