package banco;
public class TesteConta {
    public static void main(String[] args) {
        // instanciar um objeto do tipo Conta
        Conta contaCebolinha = new Conta();
        // definir os valores da conta do Cebolinha
        contaCebolinha.agencia = "0123-4";
        contaCebolinha.saldo = 2050.07;
        contaCebolinha.nConta = "3333-33";
        contaCebolinha.limite = 500;
        //contaCebolinha.nomeCliente = "Cebolinha";

        System.out.println("Objeto contaCebolinha: " + contaCebolinha);
        System.out.println("Saldo: R$ " + contaCebolinha.saldo);
        Conta aux = contaCebolinha;
        System.out.println("Objeto aux: " + aux);
        aux.saldo += 1000; // operacao de deposito -> Orientacao Objetos -> DEFINIR RESPONSABILIDADE -> PARA A PROPRIA CLASSE
        System.out.println("Saldo contaCebolinha:" + contaCebolinha.saldo);
        contaCebolinha.depositar(3000);
        contaCebolinha.depositar(-1000); // esse lancamento nao vai ter efeito
        System.out.println("Saldo contaCebolinha:" + contaCebolinha.saldo);
        if(contaCebolinha.sacar(10000)){
            System.out.println("Sucesso no saque. Retire seu dinheiro");
        }else{
            System.out.println("Saldo insuficiente ou valor invalido");
        }
        // Teste transferencia
        Conta contaChicoBento = new Conta();
        contaChicoBento.depositar(100);
        System.out.println("ANTES DA TRANSFERENCIA");
        System.out.println("Conta Chico Bento: " + contaChicoBento.saldo);
        System.out.println("Saldo contaCebolinha:" + contaCebolinha.saldo);

        // Transferir do Cebolinha para Chico Bento
        if(contaCebolinha.transferir(1000, contaChicoBento)){
            System.out.println("Transferencia realizada");
        }else{
            System.out.println("Falha na transferencia");
        }

        System.out.println("DEPOIS DA TRANSFERENCIA");
        System.out.println("Conta Chico Bento: " + contaChicoBento.saldo);
        System.out.println("Saldo contaCebolinha:" + contaCebolinha.saldo);

    }
}
