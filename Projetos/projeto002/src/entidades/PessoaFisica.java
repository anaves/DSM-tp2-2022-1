package entidades;

public class PessoaFisica {
    // atributos
    public String cpf;
    public String nome;
    
    @Override  // serve para explicitar que este metodo existe na super classe de PessoaFisica
    public String toString() {
        return "CPF " + this.cpf + " Nome: " + this.nome;
    }
}
