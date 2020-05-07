package Moteur;

import java.util.Objects;

public abstract class NullArityFormula extends Formula {
    protected Coefficients coefficients ;
    protected double rightMember;


    public NullArityFormula(Coefficients coefficients, double rightMember) {
        super(coefficients, rightMember);
        this.coefficients = coefficients ;
        this.rightMember = rightMember;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NullArityFormula that = (NullArityFormula) o;
        return Double.compare(that.rightMember, rightMember) == 0 &&
                Objects.equals(coefficients, that.coefficients) ;
    }
}
