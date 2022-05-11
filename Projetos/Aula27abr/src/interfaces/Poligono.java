package interfaces;

public abstract class Poligono implements Forma, Figuras{
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
