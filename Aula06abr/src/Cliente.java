public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private int idade;
    // Fazer os metodos de consulta - GET
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Esta atribuicao nao vamos permitir
        // vamos verificar
        if (validaCPF(cpf)){
            this.cpf = cpf;
        }
    }

    private boolean validaCPF(String cpf) {
        cpf = cpf.replace("-", "");
        cpf = cpf.replace(".", "");
        // Atividade - implementar a validacao de CPF
        if (cpf.length() == 11){ // em java == igualdade!!!
            char dv1 = cpf.charAt(9);
            char dv2 = cpf.charAt(10);
            int dv1i = Character.getNumericValue(dv1);
            

        }
        return false; // depois revemos aqui!
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    // E os metodos modificadores - SET
    public void setNome(String nome) {
        this.nome = nome;
    }
}
