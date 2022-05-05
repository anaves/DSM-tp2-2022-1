package polimorfismo;

public class Circulo extends Forma {
    @Override
    public void desenhar(){
        System.out.println("Circulo");
    }

    public void colorir(){
        System.out.println("Colorir circulo");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "circulo";
    }

}
