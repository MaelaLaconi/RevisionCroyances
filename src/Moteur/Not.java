package Moteur;

public class Not extends FormuleUnaire {
    public Not(Formule oper) {
        super(oper);
    }

    @Override
    public Formule toNNF() {
        if (child.isContrainte()) {
            return this;
        } else {
            return child.toSousNNF();
        }
    }

    @Override
    public boolean estContrainteNon() {
        return child.isContrainte();
    }

    @Override
    public Variables getVariables() {
        return child.getVariables();
    }
  /*  @Override
    public Formule toDNF() {
        return oper.toDNF();
    }*/

   /* @Override
    public boolean estSatisfaitePar(ArrayList<Variable> listX) {
        return !oper.estSatisfaitePar(listX);
    }*/

    @Override
    public String toString() {
        return "¬" + child;
    }

    @Override
    public boolean isNon() {
        return true;
    }

    public Formule toDNF() {
        return this;
    }

    @Override
    public boolean estSatisfaitePar(Interpretation inter, Variables variables) {
        return !child.estSatisfaitePar(inter, variables);
    }


    /**
     * cas ou on a non d'une contrainte
     * @return
     */
    @Override
    public boolean isContrainte(){
        return this.child.isContrainte();
    }
}
