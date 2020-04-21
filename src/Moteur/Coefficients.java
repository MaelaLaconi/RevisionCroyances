package Moteur;

import java.util.Map;

public class Coefficients extends VariableValueTable {

    public Variables getVariables(){
        Variables variables = new Variables() ;
        for (Map.Entry me : tab.entrySet()) {
            variables.add((Variable)me.getKey());
        }
        return variables ;
    }
}
