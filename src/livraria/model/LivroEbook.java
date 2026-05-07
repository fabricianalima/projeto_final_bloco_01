package livraria.model;

public class LivroEbook extends Livro{
	
	private String formatoArquivo;

	public LivroEbook(int numeroLivro, String titulo, double valor, String autor, String formatoArquivo) {
		super(numeroLivro, titulo, valor, autor);
		this.formatoArquivo = formatoArquivo;
	}

	public String getFormatoArquivo() {
		return formatoArquivo;
	}

	public void setFormatoArquivo(String formatoArquivo) {
		this.formatoArquivo = formatoArquivo;
	}
	
	@Override
	public void visualizarLivro() {
	    super.visualizarLivro();
	    System.out.println("Formato do Arquivo: " + formatoArquivo);
		System.out.println("Tipo do Livro: E-book");
	}
}
