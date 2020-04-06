package Moteur;

public class Contrainte extends FormuleUnaire{
    protected String varPropositionelle ;
    public Contrainte(String oper) {
        super(oper);
        this.varPropositionelle = oper ;
    }

    @Override
    public String toString() {
        return varPropositionelle;
    }
}
