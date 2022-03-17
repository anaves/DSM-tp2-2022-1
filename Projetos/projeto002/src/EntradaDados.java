import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite idade: ");
        int x = input.nextInt();
        int y =  x + 1;
        System.out.println("Proximo valor: " + y);
        //input.close();
    }
}
