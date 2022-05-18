public class Produto implements Comparable<Produto> {
    private static int contador; // atributo classe
    private int codigo;
    private String nome;
    private double preco;
    public Produto(String nome, double preco){
        contador++;
        setCodigo(contador);
        setNome(nome);
        setPreco(preco);
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "{codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "}";
    }

    @Override
    public int compareTo(Produto o) {
        if (this.getPreco() < o.getPreco()){
            return 1;
        }else if (this.getPreco() == o.getPreco()) {
            return 0;
        }else{
            return -1;
        }
        //return this.nome.compareTo(o.getNome());
        //return (int)(this.getPreco() - o.getPreco());
    }

    
    
}
