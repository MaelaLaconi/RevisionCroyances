import Moteur.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("dans le main");
        Formule c1 = new Contrainte("a") ;
        Et et = new Et(c1, c1) ;
        System.out.println(et.toString());
        Non non = new Non(c1) ;
        System.out.println(non.toString());
        Ou ou = new Ou(et,c1) ;
        System.out.println(ou);
    }
}
