public class TiposNumericos {
    public static void main(String[] args) {
        // float - corresponde valor numerico real
        // ex: conjunto dos reais: {1.3, 4.3, 3.14}
        float peso = 48.6f; // f quando real for float
        double altura = 1.84;  // quando o real for double, dispensa o f
        int pesoInteiro = (int)peso; // convertendo de real para int
        // espero que o int seja 48 -> vamos assumir a parte inteira
        System.out.println("Peso inteiro: " + pesoInteiro);
        String idade = "22";
        // converter de String para int
        int idadeInt = Integer.parseInt(idade);
        // converter de String para double
        double idadeDouble = Double.parseDouble(idade);
        double maior = Double.max(3.4, 4.5);
        System.out.println(maior);
        System.out.println(3/0);
        double resultado = 3+4.5;
    }
}
