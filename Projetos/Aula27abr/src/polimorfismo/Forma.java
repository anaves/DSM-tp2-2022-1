package polimorfismo;

// classe abstrata nao pode ser instanciada
public abstract class Forma {
    // desenhar toda classe filha precisa implementar
    // de metodo abstrato
    // >>> Metodo abstrato somente em classe abstrata
    public abstract void desenhar();

    // esse metodo nao necessariamente precisa ser 
    // sobrescrito pelas subclasses
    public String oi(){
        return "oi";
    }
}
