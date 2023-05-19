package banco.brasil;

public class ContaBancaria {

    private String agencia;
    private String conta;
    private double saldo;
    private Usuario proprietario;

    //Metodo construtor
    public ContaBancaria() {

    }

    public ContaBancaria(String agencia, String conta, double saldo, Usuario proprietario) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    //Metodos gets
    public String getAgencia() {
        return this.agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Usuario getProprietario() {
        return this.proprietario;
    }

    //Metodos sets
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setProprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }
    
    //Metodo com parametro
    void depositar(double valor) {
        this.saldo += valor;
    }

    void sacar(double valor) {

        if (valor < saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Fundo insuficiente para efetuar o saque");
        }
    }
    
    //Metodo com parametro
    void transferir(ContaBancaria contabancaria, double valor) {
        if (valor <= saldo) {
            this.sacar(valor);
            contabancaria.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente !");
        }

    }

    String consultarSaldo() {//Metodo sem paramentro
        //String.format() método da classe String para utilizar formatações com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.saldo);

    }
}
