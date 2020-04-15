package Moteur;

import java.util.ArrayList;

public class Non extends FormuleUnaire {
    public Non(Formule oper) {
        super(oper) ;
    }

    @Override
    public Formule toNNF() {
        if (oper.isContrainte()){
            return this ;
        }

        else{
            return oper.toSousNNF() ;
        }
    }

    @Override
    public boolean estContrainteNon(){
        return oper.isContrainte() ;
    }
  /*  @Override
    public Formule toDNF() {
        return oper.toDNF();
    }*/

    @Override
    public boolean satisfait(ArrayList<Variable> listX) {
        return !oper.satisfait(listX) ;
    }

    @Override
    public String toString() {
        return "¬"+oper;
    }

    @Override
    public boolean isNon(){
        return true ;
    }
}
