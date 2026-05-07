package livraria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                LIVRARIA BOA LEITURA!                ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Cadastrar Livro                       ");
			System.out.println("            2 - Listar todos os livros                ");
			System.out.println("            3 - Buscar livro pelo número              ");
			System.out.println("            4 - Atualizar dados do livro              ");
			System.out.println("            5 - Excluir livros                        ");
			System.out.println("            0 - Sair                                  ");
			System.out.println("******************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leitor.nextInt();
			
			if (opcao == 0) {
				System.out.println("\nAté logo! Sua sessão foi encerrada");
				sobre();
                 leitor.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Livro\n\n");

				break;
			case 2:
				System.out.println("Listar todos os livros \n\n");

				break;
			case 3:
				System.out.println("Buscar livro pelo número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados do livro\n\n");

				break;
			case 5:
				System.out.println("Excluir livros \n\n");
				
				break;
			default:
				System.out.println("\nOpção Inválida! Digite uma das opções abaixo: \n");
				break;
		}
		}
	}
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Livraria Boa Leitura! - Seu próximo livro está aqui!");
			System.out.println("*********************************************************");
	}
	
}
		
