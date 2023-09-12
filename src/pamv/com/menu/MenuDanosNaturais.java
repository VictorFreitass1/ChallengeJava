package pamv.com.menu;

import java.util.Scanner;

import pamv.com.dominio.Veiculo;

public class MenuDanosNaturais {
	private Scanner scanner;

    public MenuDanosNaturais(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuDanosNaturais() {
        while (true) {
            System.out.println();
            System.out.println("Selecione uma opção:\n");
            System.out.println("1 - Verificar se há danos causados por enchentes ou inundações");
            System.out.println("2 - Verificar se há danos causados por tempestades ou queda de árvores");
            System.out.println("3 - Levar o veículo a um mecânico especializado");
            System.out.println("4 - Retornar para página anterior");
            System.out.println("5 - Encerrar atendimento\n");

            String tipoProblemas = scanner.nextLine();

            if (tipoProblemas.equals("1")) {
                System.out.println();
                System.out.println("Estamos verificando se há danos causados por enchentes ou inundações em sua região e entraremos em contato para providenciar a assistência necessária.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("2")) {
                System.out.println();
                System.out.println("Estamos verificando se há danos causados por tempestades ou queda de árvores em sua região e entraremos em contato para providenciar a assistência necessária.\n");
                TiposDeProblemas.escolhaUsuarioEncerramento();
            } else if (tipoProblemas.equals("3")) {
                System.out.println();
                Veiculo veiculo = new Veiculo();
                String tipoVeiculo = veiculo.getTipoVeiculo();

                if (tipoProblemas.equals("3")) {
                    System.out.println();

                    if (tipoVeiculo.equals("grande porte")) {
                    	System.out.println("Estamos encaminhando a sua localização um guincho para veículos de grande porte, para que possamos levar o seu veículo a um mecânico especializado para diagnosticar e reparar os danos causados por fenômenos naturais.\n");
                    } else {
                        System.out.println("Estamos encaminhando a sua localização um guincho para veículos de pequeno/médio porte, para que possamos levar o seu veículo a um mecânico especializado para diagnosticar e reparar os danos causados por fenômenos naturais.\n");
                    }
                }
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
