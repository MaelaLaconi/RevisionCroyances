import Moteur.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Variable r = new Reel(2.5) ;
        Variable e = new Entier(1) ;
        ArrayList<Variable> arrayList = new ArrayList();
        arrayList.add(e);
        arrayList.add(r) ;
        Contrainte c1 = new Contrainte(arrayList, 6) ;
        System.out.println(c1);


        Et et = new Et(c1, c1) ;
        System.out.println(et);

        Non non = new Non(c1) ;
        System.out.println(non);

        Ou ou = new Ou(et,c1) ;
        System.out.println(ou);

        non = new Non(ou) ;
        System.out.println(non);
    }
}
