package polimorfismo;

public class AplicativoDesenho {
    public static void canvas(Forma f) {
        f.desenhar(); // comportamento polimorfismo
    }

    // public static void canvas(Circulo c){
    //     c.desenhar();
    // }

    // public static void canvas(Estrela e){
    //     e.desenhar();
    // }

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
        Retangulo r = new Retangulo();
        canvas(r);
    }
}
