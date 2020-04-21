import Moteur.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Variable r = new RealVariable("r") ;
        Variable e = new IntegerVariable("e") ;
        Coefficients coefficients = new Coefficients() ;
        coefficients.put(r, 7.);
        coefficients.put(e, 2.);

        Constraint c1 = new Constraint(coefficients, 7) ;
        Constraint c2 = new Constraint(coefficients, 10) ;

        System.out.println(c1);


        And and = new And(c1, c1) ;
        System.out.println(and);

        Not not = new Not(c1) ;
        System.out.println(not);

        Or or = new Or(and,c1) ;
        System.out.println(or);

        Formule phi = new Not(or) ;
        System.out.println(phi);



       // r = new RealVariable("x1") ;
       // e = new Entier("1") ;
        Interpretation i = new Interpretation() ;
        i.put(r, 1.);
        i.put(e, 0.);
        System.out.println("c1 = "+c1 +"\n"+i.satisfait(c1));

        and = new And(c1, c1) ;
        System.out.println("************************************");
        System.out.println(and);
        System.out.println(i.satisfait(and));

        not = new Not(and) ;
        System.out.println("************************************");
        System.out.println(not);
        System.out.println(i.satisfait(not));

        /*not = new Not(c1) ;
        System.out.println(not);
        System.out.println(i.satisfait(not));

        and = new And(not, c1) ;
        System.out.println(and);
        System.out.println(i.satisfait(and));

        or = new Or(not, c1);
        System.out.println(or);
        System.out.println(i.satisfait(or));

        and = new And(c1, c1) ;
        not = new Not(and) ;

        Formule phi2 = not.toNNF() ;
        System.out.println("**********************************************\n"+ not);
        System.out.println(phi2);

        phi2 = c1.toNNF() ;
        System.out.println("**********************************************\n"+c1);
        System.out.println(phi2);

        phi2 = and.toNNF() ;
        System.out.println("**********************************************\n"+ and);
        System.out.println(phi2);
        and = new And(c1, c2);
        or = new Or(and,c2) ;
        not = new Not(or) ;

        phi2 = not.toNNF() ;
        System.out.println("**********************************************\n"+ not);
        System.out.println(phi2);

        and = new And(c1, new Not(c2));
        phi2 = and.toNNF() ;
        System.out.println("**********************************************\n"+ and);
        System.out.println(phi2);

        not = new Not(c1) ;
        phi2 = not.toNNF() ;
        System.out.println("**********************************************\n"+ not);
        System.out.println(phi2);

        and = new And(c1, new Or(c1,c2));
        phi2 = and.toDNF() ;
        System.out.println("**********************************************\n"+ and);
        System.out.println(phi2);

        and = new And(c1, new And(c1,new Or(c1, c2)));
        phi2 = and.toDNF() ;
        System.out.println("**********************************************\n"+ and);
        System.out.println(phi2);*/
    }
}
