package Moteur;

import java.util.ArrayList;

public class Non extends FormuleUnaire {
    public Non(Formule oper) {
        super(oper);
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
}
