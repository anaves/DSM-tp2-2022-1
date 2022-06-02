
import java.util.Random;

import heranca.SubClasseA;
import heranca.SubClasseANull;
import heranca.SuperClasse;

public class Exemplo01 {
    public static void metodoTeste(SuperClasse objeto) {
        objeto.metodo();
    }

    // public static void metodoTeste(SubClasseA objeto) {
    //     objeto.metodo();
    // }

    // public static void metodoTeste(SubClasseB objeto) {
    //     objeto.metodo();
    // }

    public static SubClasseA fabricaA(){
        if (Math.random() < 0.33){
            return new SubClasseA(10);
        }else{
            return new SubClasseANull();
        }
    }

    public static void main(String[] args) {
        //metodoTeste(new SubClasseA());
        //SubClasseA obj = fabricaA();
        // if (obj == null){
        //     System.out.println("Instanciou!");
        //     obj = new SubClasseA(0);
        // }
        //obj.metodo();
        SubClasseA obj1 = new SubClasseA(2);
        obj1.principal();
        obj1.
        
    }
}
