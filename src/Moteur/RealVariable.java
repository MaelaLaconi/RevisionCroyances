package Moteur;

import java.util.ArrayList;

//real variable
public class RealVariable extends Variable {

    public RealVariable(String name) {
        super(name);
    }





    @Override
    public double toDouble(){
        return Double.valueOf(name) ;
    }

//just equals avec les types
}
