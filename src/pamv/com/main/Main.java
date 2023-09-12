package pamv.com.main;

import pamv.com.menu.TiposDeProblemas;
import pamv.com.banco.ClienteDAO;
import pamv.com.banco.VeiculoDAO;
import pamv.com.dominio.Cliente;
import pamv.com.dominio.Veiculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int escolha = Cliente.obterEscolha(scanner);

        Cliente cliente = new Cliente();
        
        if (escolha == 1) {
            cliente.cadastra();
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.inserirCliente(cliente.getNome(), cliente.getEmail(), cliente.getSenha());
        } else if (escolha == 2) {
            System.out.print("Digite seu email: ");
            String emailLogin = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String senhaLogin = scanner.nextLine();

            ClienteDAO clienteDAO = new ClienteDAO();
            if (clienteDAO.verificarLogin(emailLogin, senhaLogin)) {
                System.out.println("Login realizado com sucesso!");
                System.out.println("\nBem-vindo, " + clienteDAO.getNomeCliente(emailLogin) + "!");
            } else {
                System.out.println("Email ou senha inválidos. Tente novamente.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
        
        Veiculo veiculo = new Veiculo();
        veiculo.solicitarInformacoesVeiculo();

        VeiculoDAO veiculoDAO = new VeiculoDAO();
        veiculoDAO.inserirVeiculo(veiculo);

              
        TiposDeProblemas menuPrincipal = new TiposDeProblemas(scanner);
        menuPrincipal.exibirMenu();
      
        scanner.close();
    }
}