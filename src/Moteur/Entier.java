package Moteur;

public class Entier extends Variable {
    public Entier(int n) {
        super(n);
    }

    @Override
    public String toString() {
        return String.valueOf(entier);
    }
}
