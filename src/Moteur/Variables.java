package Moteur;

import java.util.ArrayList;
import java.util.Iterator;

public class Variables implements Iterable {
    protected ArrayList<Variable> variables ;
    public Variables(ArrayList<Variable> variables) {
        this.variables = variables ;
    }

    public Variables() {
        this.variables = new ArrayList<Variable>() ;
    }
    @Override
    public Iterator iterator() {
        return variables.iterator();
    }

    public void add(Variable variable){
        variables.add(variable) ;
    }

    public Variables union(Variables variables){
        Variables var = this ;

        for(Object o : variables){
            if (!var.contains((Variable)o)) {
                var.add((Variable) o);
            }
        }
        return var ;
    }

    @Override
    public String toString() {
        return "Variables{" +
                "variables=" + variables +
                '}';
    }

    public boolean contains(Variable var){
        return variables.contains(var) ;
    }
}
