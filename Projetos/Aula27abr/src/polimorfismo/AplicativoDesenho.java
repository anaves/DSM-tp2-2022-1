package polimorfismo;

public class AplicativoDesenho {
    public static void canvas(Forma f) {
        f.desenhar(); // comportamento polimorfismo
    }

    public static void exibir(Forma elementos[]) {
        System.out.println("----EXIBIR----");
        for (Forma f : elementos) {
            f.desenhar();
        }
    }

    public static void canvas2(Forma f) {
        System.out.println("CANVAS 2");
        f.desenhar();
        if (f instanceof Circulo){
            Circulo c = (Circulo)f; // amarracao (CAST)
            c.colorir();
            c.desenhar();
        }
    }
    public static void main(String[] args) {
        Forma tipoForma = new Estrela();
        Circulo tipoCirculo = new Circulo();
        
        canvas(tipoForma);
        canvas(tipoCirculo);
        canvas(new Quadrado());

        Forma vetor[]={new Circulo(),tipoCirculo, new Quadrado(), new Circulo()};
        exibir(vetor);
        if (tipoCirculo instanceof Circulo){ // instanceof verifica o tipo do objeto
            System.out.println("Realmente eh circulo");
        }
        canvas2(new Quadrado());
        canvas2(new Circulo());
    }
}
