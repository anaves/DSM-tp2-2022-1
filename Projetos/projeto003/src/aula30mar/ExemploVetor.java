package aula30mar;

import java.util.Arrays;

public class ExemploVetor {
    public static void main(String[] args) {
        int numeros[] = new int[6]; 
        // 0 | 1 | 2 | 3 | 4 | 5 -> tamanho 6
        System.out.println("Consultar tamanho do vetor");
        System.out.println(numeros.length);
        // loop
        numeros[3] = 90; // atribuir valor ao vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("posicao " + i);
            System.out.println(" conteudo " + numeros[i]);
        }
        //numeros[6] = 80; // posicao 6 nao existe!
        numeros[0] = 20;
        numeros[4] = 65;
        numeros[5] = 70;
        for (int i : numeros) { // for i in numeros: //se Python
            System.out.println(i);
        }
        int tamanho = 5;
        String nomes[] = new String[tamanho]; // vetor de Strings
        nomes[0] = "Cebolinha"; nomes[1] = "Cascao"; nomes[2] = "Magali";
        nomes[3] = "Monica"; nomes[4] = "Franjinha";
        for (String personagem : nomes) {
            System.out.println("Personagem " + personagem);
        }
        Arrays.sort(numeros); // ordena o vetor numeros
        Arrays.sort(nomes);
        System.out.println("VETOR ORDENADO");
        for (String personagem : nomes) {
            System.out.println("Personagem " + personagem);
        }
        System.out.println("Vetor numeros ordenados");
        for (int i : numeros) { // for i in numeros: //se Python
            System.out.println(i);
        }

        String strA = "Chico Bento";
        nomes[1] = strA;
        System.out.println("posicao 1: " + nomes[1]);
        strA = "Ze Lele";
        System.out.println("posicao 1: " + nomes[1]);
    }
}
