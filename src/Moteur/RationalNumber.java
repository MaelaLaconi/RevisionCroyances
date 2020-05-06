package Moteur;

public class RationalNumber {
    private Double value ;

    public RationalNumber(Double value) {
        this.value = value;
    }


    public RationalNumber mult(RationalNumber rationalNumber){
        return new RationalNumber(this.value*rationalNumber.getValue()) ;
    }

    public RationalNumber plus(RationalNumber rationalNumber){
        return new RationalNumber(this.value+rationalNumber.getValue()) ;
    }

    /**
     * lower or equals
     * @param
     * @return
     */
    public boolean leq(Double d){
        return this.value<=d ;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
