package Moteur;

public abstract class Variable extends  FormuleArite0{


    public Variable(String nom) {
        super(nom);
    }

   /* protected Variable(int n) {
        this.entier = n;
    }
    protected Variable(double n) {
        this.reel = n;
    }*/

    public double toDouble(){
        return Double.valueOf(nom) ;
    }


    public int toInt(){
        return Integer.valueOf(nom) ;
    }

}
