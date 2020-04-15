import Moteur.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Variable r = new Reel("1.5") ;
        Variable e = new Entier("1") ;
        ArrayList<Variable> arrayList = new ArrayList();
        arrayList.add(e);
       // arrayList.add(r) ;
        Contrainte c1 = new Contrainte(arrayList, 6) ;
        Contrainte c2 = new Contrainte(arrayList, 10) ;

        System.out.println(c1);


        Et et = new Et(c1, c1) ;
        System.out.println(et);

        Non non = new Non(c1) ;
        System.out.println(non);

        Ou ou = new Ou(et,c1) ;
        System.out.println(ou);

        Formule phi = new Non(ou) ;
        System.out.println(phi);



        r = new Reel("10") ;
       // e = new Entier("1") ;
        ArrayList<Variable> listX = new ArrayList();
        listX.add(r) ;
       // listX.add(e) ;
        Interpretation i = new Interpretation(listX) ;
        System.out.println(i.satisfait(c1));

        et = new Et(c1, c1) ;
        System.out.println(i.satisfait(et));

        non = new Non(et) ;
        System.out.println(non);
        System.out.println(i.satisfait(non));

        non = new Non(c1) ;
        System.out.println(non);
        System.out.println(i.satisfait(non));

        et = new Et(non, c1) ;
        System.out.println(et);
        System.out.println(i.satisfait(et));

        ou = new Ou(non, c1);
        System.out.println(ou);
        System.out.println(i.satisfait(ou));

        et = new Et(c1, c1) ;
        non = new Non(et) ;

        Formule phi2 = non.toNNF() ;
        System.out.println("**********************************************\n"+non);
        System.out.println(phi2);

        phi2 = c1.toNNF() ;
        System.out.println("**********************************************\n"+c1);
        System.out.println(phi2);

        phi2 = et.toNNF() ;
        System.out.println("**********************************************\n"+et);
        System.out.println(phi2);
        et = new Et(c1, c2);
        ou = new Ou(et,c2) ;
        non = new Non(ou) ;

        phi2 = non.toNNF() ;
        System.out.println("**********************************************\n"+non);
        System.out.println(phi2);

        et = new Et(c1, new Non(c2));
        phi2 = et.toNNF() ;
        System.out.println("**********************************************\n"+et);
        System.out.println(phi2);

        non = new Non(c1) ;
        phi2 = non.toNNF() ;
        System.out.println("**********************************************\n"+non);
        System.out.println(phi2);

    }
}
