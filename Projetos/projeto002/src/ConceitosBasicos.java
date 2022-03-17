public class ConceitosBasicos {
    public static void main(String[] args) {
        // condicional
        int x = 10;
        if (x>5){
            System.out.println(x + " eh maior que 5 ");
        }else{
            System.out.println(x + " eh menor ou que 5");
        }
        // estrutura de repeticao
        for (int i = 0; i < 6; i++) {
            System.out.println("ola " + i);
        }
        //System.out.println("valor de i "+ i); // i no escopo do for
        int j = 0;
        // while -> condicao eh avaliada no inicio
        while (j<5){
            System.out.println("mundo " + j);
            j++; // incrementar o valor de j
        }
        // do - while -> condicao eh avaliada apos o loop
        // pelo menos 1 vez os comandos sao executados
        int z = 0;
        do{
            System.out.println("valor de z " + z);
            z++;
        }while(z<5);

    }
}
