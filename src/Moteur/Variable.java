package Moteur;


import java.util.Objects;

//n'extends pas
public abstract class Variable{
    protected String name ;
    //regarder super methode pour name, et equals type sdans entier ou reel
    public Variable(String name) {
        this.name = name;
    }


    public double toDouble(){
        return Double.valueOf(name) ;
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
        return Objects.equals(name, variable.name);
    }



    //equals meme nom et meme type reel ou entier
}
