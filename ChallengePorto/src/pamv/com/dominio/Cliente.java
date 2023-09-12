package pamv.com.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	private String nome;
	private String email;
	private String senha;
	
	public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
	
	public Cliente() {

    }
	
	public static int obterEscolha(Scanner scanner) {
	    int escolha = 0;
	    boolean escolhaValida;

	    do {
	        escolhaValida = true;
	        System.out.println("Olá, digite (1) para se cadastrar e (2) para realizar o login");
	        if (scanner.hasNext()) {
	            if (!scanner.hasNextInt()) {
	                scanner.next();
	                escolhaValida = false;
	            } else {
	                escolha = scanner.nextInt();
	                scanner.nextLine();
	                if (escolha != 1 && escolha != 2) {
	                    escolhaValida = false;
	                }
	            }
	        } else {
	            scanner.next();
	            escolhaValida = false;
	        }
	    } while (!escolhaValida);
	    return escolha;
	}
		
	public void cadastra() {
    	Scanner scanner = new Scanner(System.in);
        
		System.out.println("Bem-vindo ao cadastro de clientes!");
	        
	    System.out.print("Digite seu nome: ");
	    nome = scanner.nextLine();
	    setNome(nome);
	        		        
	    System.out.print("Digite seu email: ");
	    email = scanner.nextLine();
	       
	    System.out.println("Digite sua nova senha: ");
	    senha = scanner.nextLine();
	    
	    System.out.println("Cliente cadastrado com sucesso!");
 
    }
    
    public void realizaLogin(String email, String senha) {
    	Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de login!");
        while (true) {    
        System.out.print("Digite seu email: ");
        String emailLogin = scanner.nextLine();
        
        System.out.print("Digite sua senha: ");
        String senhaLogin = scanner.nextLine();
        }
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
        } else {
        	throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
    }
    
    public String getNome() {
        return nome;
    }

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
}
