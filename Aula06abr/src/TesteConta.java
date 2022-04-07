public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        //c.saldo = 5000; // nao devemos permitir isto!
        c.setLimite(1000);
        if(c.depositar(10)){
            System.out.println("Deposito com sucesso");
        }else{
            System.out.println("Deposito nao realizado");
        }

        System.out.println("Saldo antes: R$ " + c.getSaldo());
        if (c.sacar(990)){
            System.out.println("Saque realizado");
            System.out.println("Saldo atual R$ " + c.getSaldo());
        }else{
            System.out.println("Saque nao foi permitido");
        }

        if (c.sacar(15)){
            System.out.println("Saque realizado");
            System.out.println("Saldo atual R$ " + c.getSaldo());
        }else{
            System.out.println("Saque nao foi permitido");
        }
        
    }
}
