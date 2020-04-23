package Moteur;


import java.util.Objects;

//n'extends pas
public abstract class Variable{
    protected String name ;
    protected boolean isInteger ;
    protected boolean isReal ;

    //regarder super methode pour name, et equals type sdans entier ou reel
    public Variable(String name) {
        this.name = name;
        this.isInteger = false ;
        this.isReal = false ;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variable variable = (Variable) o;
        return Objects.equals(name, variable.name) ;
    }

    public boolean isInteger() {
        return isInteger;
    }

    public boolean isReal() {
        return isReal;
    }
//equals meme nom et meme type reel ou entier
}
