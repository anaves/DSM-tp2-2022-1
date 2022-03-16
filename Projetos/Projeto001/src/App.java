public class App {
	public static void main(String[] args) {
		int idade = 20;
		System.out.println("Idade atual " + idade);
		int idadeAnoQueVem = idade + 1;
		System.out.println("Nova idade " + idadeAnoQueVem);
		System.out.println("Nova idade " + idade + 1);
		System.out.println("Nova idade " + (idade + 1));
		System.out.println(idade + 1);
		System.out.println("Nova idade " + idade + 1 + " anos");
		System.out.println("Nova idade " + (idade + 1) + " anos");
		System.out.println(idade + 1 + " anos");
		System.out.println("Nova idade " + true);
		int valor = 'a';
		System.out.println(valor);
		char caracter = 65;
		System.out.println(caracter);
		String nome = "rex";  // exemplo de uma String
		System.out.println("Nome do cachorro: " + nome.toUpperCase());
		if (idade >=18) {
			System.out.println("Maior de idade");
			System.out.println("pode dirigir");
		} else {
			System.out.println("nao pode dirigir");
		}
		boolean resultado = idade>=18 ? true : false;
		System.out.println("variavel booleana " + resultado);
		
	}

}