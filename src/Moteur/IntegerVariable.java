package Moteur;

public class IntegerVariable extends Variable {

    public IntegerVariable(String name) {
        super(name);
        isInteger = true ;
    }

    @Override
    public boolean equals(Object o) {
        Variable variable = (Variable)o ;
        return isInteger== variable.isInteger() ;
    }
}
