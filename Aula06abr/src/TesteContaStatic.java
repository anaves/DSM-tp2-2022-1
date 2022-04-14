public class TesteContaStatic{
    public static void main(String[] args) {
        System.out.println(Conta.QTD_METODO());
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        System.out.println("da classe usuaria");
        // System.out.println(c1.QTD);
        // System.out.println(c2.QTD);
        // System.out.println(Conta.QTD);
    }  
}