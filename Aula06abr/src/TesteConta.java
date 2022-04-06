public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        //c.saldo = 5000; // nao devemos permitir isto!
        System.out.println("Saldo: R$ " + c.getSaldo());
    }
}
