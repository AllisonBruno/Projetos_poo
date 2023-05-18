package banco.brasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando um objeto do tipo contaBancaria e referenciando nas variaveis contaBancaria1 e contaBancaria2\\
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();
        /*
        //Atribuindo valores ao objeto 
        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "12345";
        contaBancaria1.proprietario = "Junior";
        contaBancaria1.saldo = 1.99;
        
        
        System.out.println(contaBancaria1.agencia+ "\n"
        + contaBancaria1.conta + "\n"
        + contaBancaria1.proprietario + "\n"
        + contaBancaria1.saldo);
        //System.out.println(contaBancaria1.toString());
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco do Brasil");
        System.out.println("Cadastro de contas");
        System.out.println("Digite a agencia ->");
        contaBancaria1.agencia = scan.next();
        System.out.println("Digite a conta ->");
        contaBancaria1.conta = scan.next();
        //Construcao e insercao dos daods do usuario
        System.out.print("\nDados do Usuario");
        System.out.println("\nDigite o nome do cliente ->");
        user1.nome = scan.next();
        System.out.println("Digite o sobrenome do cliente ->\n");
        user1.sobrenome = scan.next();
        System.out.println("Digite o telefone do cliente ->\n");
        user1.telefone = scan.next();
        contaBancaria1.proprietario = user1;
        System.out.println("Digite o valor de deposito ->\n");
        contaBancaria1.depositar(scan.nextDouble());

        System.out.println(contaBancaria1.agencia + "\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimirInfo()+"\n"
                + contaBancaria1.consultarSaldo());

        System.out.println("\n\nDigite o valor para saque ->");
        contaBancaria1.sacar(scan.nextDouble());

        System.out.println(contaBancaria1.consultarSaldo());

    }
}
