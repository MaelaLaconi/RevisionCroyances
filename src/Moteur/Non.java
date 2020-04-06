package Moteur;

public class Non extends FormuleUnaire {
    public Non(Formule oper) {
        super(oper);
    }

    @Override
    public String toString() {
        return "¬("+oper+")";
    }
}
