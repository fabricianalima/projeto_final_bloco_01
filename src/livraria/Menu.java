package livraria;

import java.util.InputMismatchException;
import java.util.Scanner;

import livraria.controller.LivrariaController;
import livraria.model.Livro;
import livraria.model.LivroEbook;
import livraria.model.LivroFisico;

public class Menu {
	
	private static Scanner leitor = new Scanner(System.in);
	private static final LivrariaController livrariaController = new LivrariaController();
	
	 public static void criarLivrosTeste() {

	        livrariaController.cadastrarLivro(
	            new LivroFisico(
	                livrariaController.gerarNumero(),
	                "Harry Potter",
	                59.90,
	                "J.K Rowling",
	                "Capa Dura"
	            )
	        );
	    }
	public static void main(String[] args) {

        criarLivrosTeste();

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

			try {

			    opcao = leitor.nextInt();
			    leitor.nextLine();

			} catch (InputMismatchException e) {

			    System.out.println("\nDigite apenas números!");

			    leitor.nextLine();

			    continue;
			}
			
			if (opcao == 0) {
				System.out.println("\nAté logo! Sua sessão foi encerrada");
				sobre();
                 leitor.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Livro\n\n");
				
				cadastrarLivros();
				
				break;
			case 2:
				System.out.println("Listar todos os livros \n\n");
				
				listarLivros();
				
				break;
			case 3:
				System.out.println("Buscar livro pelo número\n\n");
				
				procurarLivroPorNumero();
				
				break;
			case 4:
				System.out.println("Atualizar dados do livro\n\n");
				
				atualizarLivro();
				
				break;
			case 5:
				System.out.println("Excluir livros \n\n");
				
			    deletarLivro();

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
	
		private static void listarLivros() {
			livrariaController.listarLivro();
		}
		
		private static void cadastrarLivros() {
			System.out.println("Digite o título do livro: ");
			String titulo = leitor.nextLine();
			
			System.out.println("Digite o tipo do livro (1 - Físico | 2 - E-book: ");
			int tipo = leitor.nextInt();
			leitor.nextLine();

			System.out.println("Digite o valor do livro: ");
			String valorDigitado = leitor.nextLine().replace(",", ".");
			double valor = Double.parseDouble(valorDigitado);
					
			System.out.println("Digite o autor do livro: ");
			String autor = leitor.nextLine();

			switch (tipo) {
			case 1 -> {
				System.out.println("Digite o tipo de capa: ");
				String tipoDeCapa = leitor.nextLine();
				livrariaController.cadastrarLivro(new LivroFisico(livrariaController.gerarNumero(), titulo, valor, autor, tipoDeCapa));
			}

			case 2 -> {
				System.out.println("Digite o formato do arquivo: ");
				String formatoArquivo = leitor.nextLine();
				livrariaController.cadastrarLivro(new LivroEbook(livrariaController.gerarNumero(), titulo, valor, autor, formatoArquivo));
			}

			
			default -> System.out.println("Tipo de conta inválido!");
			}
		}
		
		private static void procurarLivroPorNumero() {

			System.out.print("Digite o número do livro: ");
			int numero = leitor.nextInt();
			leitor.nextLine();

			livrariaController.procurarLivroPorNumero(numero);
}
		private static void atualizarLivro() {
			System.out.println("Digite o número do livro: ");
			int numero = leitor.nextInt();
			leitor.nextLine();

			Livro livro = livrariaController.buscarNaCollection(numero);

			if (livro != null) {
				
				int numeroLivro = livro.getNumeroLivro();
				String titulo = livro.getTitulo();
				double valor = livro.getValor();
				String autor = livro.getAutor();
				String entrada = leitor.nextLine();

				System.out.printf("Título atual: %s\nNovo Título (pressione ENTER para manter): ", titulo);
				entrada = leitor.nextLine();
				titulo = entrada.isEmpty() ? titulo : (entrada);

				System.out.printf("Valor atual: R$ %.2f\nNovo valor (pressione ENTER para manter): ", valor);
				entrada = leitor.nextLine();
				valor = entrada.isEmpty() ? valor : Double.parseDouble(entrada.replace(',', '.'));
				
				System.out.printf("Autor atual: %s\nNovo autor: ", autor);
				entrada = leitor.nextLine();
				autor = entrada.isEmpty() ? autor : entrada;

				if (livro instanceof LivroFisico) {

					String tipoDeCapa = ((LivroFisico) livro).getTipoDeCapa();
					System.out.printf("Tipo de capa atual: %s\nNova Capa: ", tipoDeCapa);
					entrada = leitor.nextLine();
					
				    tipoDeCapa = entrada.isEmpty() ? tipoDeCapa : entrada;

					livrariaController.atualizarLivro(new LivroFisico(numeroLivro, titulo, valor, autor, tipoDeCapa));
					
				}else if (livro instanceof LivroEbook) {
			
					String formatoArquivo = ((LivroEbook) livro).getFormatoArquivo();
					System.out.printf("Tipo de arquivo atual: %s\nNovo tipo de arquivo (pressione ENTER para manter): ", formatoArquivo);
					entrada = leitor.nextLine();
					
				    formatoArquivo = entrada.isEmpty() ? formatoArquivo : entrada;

					livrariaController.atualizarLivro(new LivroEbook(numeroLivro, titulo, valor, autor, formatoArquivo));
				
			}
			}else {
				System.out.printf("\nO livro número %d não foi encontrado!\n", numero);
			}
			}
		
			private static void deletarLivro() {

			    System.out.println("Digite o número do livro: ");

			    int numero = leitor.nextInt();
			    leitor.nextLine();

			    livrariaController.deletarLivro(numero);
			}



}