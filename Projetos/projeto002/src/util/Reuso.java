package util;

public class Reuso {
    /* public - visibilidade do metodo (visivel em todo o projeto)
    static - que o metodo pode ser usado sem instanciar um objeto, eh um metodo de classe
    void - significa que este metodo nao tem retorno
    print - nome que definimos para o metodo
    Object msg -> que o metodo espera um objeto qualquer como parametro
    */
    public static void print(Object msg) {
        System.out.println(msg);
    }
}
