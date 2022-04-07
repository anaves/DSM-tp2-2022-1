public class Conta {
    private double saldo;
    private double limite;
    
    // apenas o metodo de consulta saldo
    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {

        if (limite >= 0){
            this.limite = limite;
        }
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if(valor <= this.getLimite()+this.getSaldo()){
            double novoSaldo = this.getSaldo()-valor;
            //this.saldo = novoSaldo;
            this.setSaldo(novoSaldo); // usando o metodo privado
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0){
            double saldoAtual = this.getSaldo();
            this.setSaldo(saldoAtual+valor);
            return true;
        }else{
            return false;
        }
    }

    
    
    
    
}
