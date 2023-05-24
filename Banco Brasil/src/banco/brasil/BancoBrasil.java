package banco.brasil;

import java.util.ArrayList;
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
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco do Brasil");
        System.out.println("Cadastro de contas");
        System.out.println("Digite a agencia ->");
        contaBancaria1.setAgencia(scan.next());
        System.out.println("Digite a conta ->");
        contaBancaria1.setConta(scan.next());
        //Construcao e insercao dos daods do usuario
        System.out.print("\nDados do Usuario");
        System.out.println("\nDigite o nome do cliente ->");
        user1.setNome(scan.next());
        System.out.println("Digite o sobrenome do cliente ->\n");
        user1.setSobenome(scan.next());
        System.out.println("Digite o telefone do cliente ->\n");
        user1.setTelefone(scan.next());
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
         */

        Scanner scan = new Scanner(System.in);
        int opcao = 0, qtdCadastro = 0;
        boolean verificador = false;
        Usuario user;
        ArrayList<Usuario> users = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ContaBancaria conta = new ContaBancaria();
        GerenteRepositorio db_gerente = new GerenteRepositorio();
        db_gerente.addGerente();
        
        gerentes = db_gerente.addGerente();
        
        do{
        System.out.println("Seja bem vindo ao banco brasil");
        System.out.println("Login:");
        String login = scan.next();
        System.out.println("Password: ");
        String password = scan.next();
        
        for(Gerente g : gerentes){
            if(g.getLogin().equals(login) && g.getPassword().equals(password)){
                verificador = true;
            }else{
                System.out.println("Login ou Senha incorreta !");
            }
        }
        }while(verificador != true);
        
        while (opcao != 3) {
            System.out.println("**Banco do Brasil***");
            System.out.println("**1- Cadastro de cliente**");
            System.out.println("**2- cadastro de conta**");
            System.out.println("**3- sair*");
            System.out.println("**Escolha uma opcao: **");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de cliente");
                    System.out.println("Quantidade de cadastros: ");
                    qtdCadastro = scan.nextInt();
                    for (int i = 0; i < qtdCadastro; i++) {
                        user = new Cliente();
                        System.out.println("Nome: ");
                        user.setNome(scan.next());
                        System.out.println("Sobrenome: ");
                        user.setSobenome(scan.next());
                        System.out.println("Telefone: ");
                        user.setTelefone(scan.next());

                        users.add(user);
                    }

                    break;
                case 2:

                    System.out.println("Agencia: ");
                    conta.setAgencia(scan.next());
                    System.out.println("Cadastro da conta");
                    conta.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");

                    if (users.size() == 0) {
                        System.out.println("Vetor vazio");
                    } else {

                        for (int i = 0; i < qtdCadastro; i++) {
                            System.out.printf("%d - %s %s \n", i + 1, users.get(i).getNome(), users.get(i).getSobrenome());
                        }

                        System.out.println("Selecione o cliente: ");
                        int userOpcao = scan.nextInt();
                        if (userOpcao >= 0) {
                            conta.setProprietario(users.get(userOpcao -1));
                            System.out.println("Digite o valor de deposito ->");
                            contaBancaria1.depositar(scan.nextDouble());
                        } else {
                            System.out.println("Nenhum usuario cadastrado");
                        }
                        break;
                    }
                case 3:
                    System.out.println("Até breve");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        }

    }
}
