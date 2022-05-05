package polimorfismo;

public abstract class Forma {
    // desenhar toda classe filha precisa implementar
    // de metodo abstrato
    public abstract void desenhar();
    // esse metodo nao necessariamente precisa ser 
    // sobrescrito pelas subclasses
    public String oi(){
        return "oi";
    }
}
