package pamv.com.menu;

import java.util.Scanner;

public class MenuAcidentesTransito {
	private Scanner scanner;

    public MenuAcidentesTransito(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuAcidentesTransito() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma opção:\n");
            System.out.println("1 - Verificar se há vítimas e prestar socorro");
            System.out.println("2 - Registrar o acidente junto às autoridades");
            System.out.println("3 - Acionar o seguro");
            System.out.println("4 - Retornar para página anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();
                      
            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos enviando uma viatura particular para o endereço. Iremos te fornecer todo suporte necessário para prestar socorro às vítimas do acidente.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos registrando o acidente junto às autoridades!\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("3")) {
                System.out.println();
                System.out.println("Estamos acionando o seguro para te ajudar!\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("4")) {
                break;
            } else if (tipoProblemas.equals("5")) {
                System.out.println();
                System.out.println("Agradecemos por utilizar nosso sistema de ajuda!");
                System.exit(0);
            } else {
                System.out.println();
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }
        }
    }
}
