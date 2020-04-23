package Moteur;

public class Interpretation extends VariableValueTable {
    public Interpretation() {
    }

    public boolean satisfait(Formule formule){
       /* Formule phi = formule.toNNF() ;
        phi = phi.toDNF();
        System.out.println("apres dnf : "+phi);*/
        return formule.estSatisfaitePar(this, formule.getVariables()) ;
    }
}
