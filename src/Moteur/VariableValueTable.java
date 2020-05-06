package Moteur;

import java.util.HashMap;
import java.util.Map;

public abstract class VariableValueTable {
    protected HashMap<Variable, RationalNumber> tab ;  //pas mettre double, encapsuler en rationalNumber (+ et * donne aussi rationalNumber)
    //definir plus(rn) -> rn, toString, mult, leq dans

    //definir operation de base utilise par lpsolve

    public VariableValueTable() {
        tab = new HashMap<>() ;
    }


    /**
     * add key and value to the hashmap
     * @param key Variable
     * @param value RationalNumber
     */
    public void put(Variable key, RationalNumber value) {
        tab.put(key, value) ;
    }

    public boolean satisfies(Formula formula){
        return false ;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder() ;

        for (Map.Entry me : tab.entrySet()) {
            res.append(me.getValue()+"*"+me.getKey()+"+") ;
        }

        //remove the last +
        String str = res.toString();
        str = str.substring(0, str.length() - 1);
        return str ;
    }

    public RationalNumber get(Variable var){
        return tab.get(var) ;
    }
}
