package Moteur;

public abstract class FormuleUnaire extends Formule {
    protected Formule oper ;

    public FormuleUnaire(Formule oper) {
        super(oper);
        this.oper = oper;
    }



}
