package classes_abstratas;

import polimorfismo.Quadrilatero;

public class App {
    public static void main(String[] args) {
        //Forma forma = new Forma(); // ERRO
        //Poligono poligono = new Poligono(4); // ERRO
        Retangulo retangulo = new Retangulo();
        retangulo.aumentar(3);
        retangulo.desenhar();
        System.out.println("lados: " + retangulo.getLados());
        retangulo.pintar(5);
        // Forma obj;
        // Poligono obj;
        Retangulo obj;
        obj = new Retangulo(); 
        //obj. 
    }
}
