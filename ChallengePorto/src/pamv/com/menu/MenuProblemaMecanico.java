package pamv.com.menu;

import java.util.Scanner;

public class MenuProblemaMecanico {
	private Scanner scanner;

    public MenuProblemaMecanico(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuProblemasMecanicos() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma opção:\n");
            System.out.println("1 - Verificar o óleo e o líquido de arrefecimento");
            System.out.println("2 - Verificar os pneus e o sistema de suspensão");
            System.out.println("3 - Levar o veículo a um mecânico especializado");
            System.out.println("4 - Retornar para página anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();

            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos a seu caminho para que possamos verificar o nível e a qualidade do óleo e do líquido de arrefecimento e fazer os reparos necessários.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos a seu caminho para que possamos verificar o estado dos pneus e do sistema de suspensão, e realizar os devidos reparos.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("3")) {
                System.out.println();
                System.out.println("Estamos encaminhando a sua localização a um guincho para que possamos levar o seu veículo a um mecânico especializado para diagnosticar e reparar o problema elétrico.\n");
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
