package banco.brasil;

public class ContaBancaria {

    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;

    void depositar(double valor) {//Metodo com parametro
        this.saldo += valor;
    }

    void sacar(double valor) {

        if (valor < saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Fundo insuficiente para efetuar o saque");
        }
    }

    void transferir(ContaBancaria contabancaria, double valor) {//Metodo com parametro
        if(valor <= saldo){
            this.sacar(valor);
            contabancaria.saldo += valor;
        }else{
            System.out.println("Saldo insuficiente !");
        }
            
    }

    String consultarSaldo() {//Metodo sem paramentro
        //String.format() método da classe String para utilizar formatações com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.saldo);

    }
}
