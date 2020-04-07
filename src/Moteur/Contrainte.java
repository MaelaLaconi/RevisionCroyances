package Moteur;

import java.util.ArrayList;

public class Contrainte extends FormuleArite0{

    public Contrainte(ArrayList contrainte, double valeur) {
        super(contrainte, valeur);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("(" + list.get(0)+"*x1") ;
        int i ;
        int index ;
        for(i=1; i<list.size(); i++){
            index = i + 1 ;
            res.append(" + " + list.get(i)+"*x"+index) ;
        }
        res.append(" ≤ "+valeur+")") ;
        return res.toString() ;
    }
}
