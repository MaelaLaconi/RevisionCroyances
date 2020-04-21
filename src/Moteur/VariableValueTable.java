package Moteur;

import java.util.HashMap;
import java.util.Map;

public class VariableValueTable {
    protected HashMap<Variable, Double> tab ;
    public VariableValueTable() {
        tab = new HashMap<>() ;
    }

    public void put(Variable key, Double value) {
        tab.put(key, value) ;
    }

    public boolean satisfait(Formule formule){
        return false ;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder() ;

        for (Map.Entry me : tab.entrySet()) {
            res.append(me.getValue()+"*"+me.getKey()+"+") ;
        }

        String str = res.toString();
        str = str.substring(0, str.length() - 1);
        return str ;
    }

    public Double get(Variable var){
        return tab.get(var) ;
    }
}
