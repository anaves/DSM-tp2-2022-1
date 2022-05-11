package classes_abstratas;

public abstract class Poligono extends Forma{
    private int lados;
    // construtor
    public Poligono(int lados){
        this.lados = lados;
    }
    // metodo concreto
    public int getLados() { 
        System.out.println("Poligono.getLados()");
        return this.lados;        
    }
    // metodo abstrato
    public abstract void pintar(int cor);
}
