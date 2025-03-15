import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cli = new Cliente();
        CadastroClientes cad = new CadastroClientes();
        Scanner entrada = new Scanner(System.in);

        boolean condOut = false;

        do {


            System.out.println("\n\n---MENU DO SISTEMA---\n\n");
            System.out.println("1 - Cadastrar novos clientes");
            System.out.println("2 - Visualizar dados de clientes");
            System.out.println("3 - Modificar e-mail de clientes");
            System.out.println("4 - Exibir todos os clientes");

            System.out.println("5 - Sair");


            System.out.println("\nEscolha um numero: ");
            int menu = entrada.nextInt();
            entrada.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = entrada.nextLine();

                    System.out.println("Digite o email do cliente: ");
                    String email = entrada.nextLine();

                    System.out.println("Digite a idade do cliente: ");
                    int idade = Integer.parseInt(entrada.nextLine());


                    cli.setNome(nome);
                    cli.setEmail(email);
                    cli.setIdade(idade);

                    cad.addCliente(nome, email, idade);
                    break;
                case 2:
                    System.out.println("Digite o nome do cliente para buscar: ");
                    String nomeBusca = entrada.nextLine();
                    cad.buscarCliente(nomeBusca);
                    break;

                case 3:

                    System.out.println("Digite o cliente que deseja editar: ");
                    String nomeCliente = entrada.nextLine();

                    System.out.println("Digite o email atual: ");
                    String emailCliente = entrada.nextLine();
                    
                    System.out.println("Digite o email novo: ");
                    String novoEmail = entrada.nextLine();


                    cad.modificarEmail(nomeCliente, emailCliente, novoEmail);
                    break;

                case 4:
                    cad.exibirCliente();
                    break;

                case 5:
                    condOut = true;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Digite novamente");
            }

        } while(!condOut);

        entrada.close();
    }

}