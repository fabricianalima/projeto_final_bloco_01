package livraria.model;

public class LivroEbook extends Livro{
	
	private String formatoArquivo;

	public LivroEbook(String titulo, double valor, int numeroLivro, String autor, String formatoArquivo) {
		super(titulo, valor, numeroLivro, autor);
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
