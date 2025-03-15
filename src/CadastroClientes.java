import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
    public List<Cliente> clienteList = new ArrayList<>();

    public void addCliente(String nome, String email, int idade) {
        Cliente newCliente = new Cliente();
        newCliente.setNome(nome);
        newCliente.setEmail(email);
        newCliente.setIdade(idade);
        clienteList.add(newCliente);
        System.out.println("Cliente cadastrado com sucesso! - " + newCliente.getNome() + "\n");

    }

    public void buscarCliente(String nome) {
        boolean encontrado = false;
        for (Cliente cliente : clienteList) {
            if (cliente.getNome().equals(nome)) {
                System.out.println("Cliente encontrado: " + cliente.getNome());
                System.out.println("email: " + cliente.getEmail());
                System.out.println("idade: " + cliente.getIdade());
                encontrado = true;
                break;
            }

        }
        if (!encontrado) {
                System.out.println("Esse cliente não foi cadastrado: ");

        }
    }

    public void modificarEmail(String nome, String email, String novoEmail) {
        boolean clienteEncontrado = false;
        for (Cliente cliente : clienteList) {
            if (cliente.getNome().equals(nome)) {
                clienteEncontrado = true;
                if (cliente.getEmail().equals(email)) {
                    cliente.setEmail(novoEmail);
                    System.out.println("Email atualizado para " + novoEmail);
                    return;
                } else {
                    System.out.println("Email incorreto.");
                    return;
                }
            }

        }

        if (!clienteEncontrado) {
            System.out.println("Cliente não existe.");
        }
    }

    public String exibirCliente() {

            if (clienteList.size() > 0) {

                for (int i = 0; i < clienteList.size(); i++) {
                    Cliente cliente = clienteList.get(i);
                    System.out.println(i + 1 + "- Nome: " + cliente.getNome());
                }
            } else {
                System.out.println("Nenhum cliente encontrado\n\n");
            }

        return clienteList.toString();
    }


}
