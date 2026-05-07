package livraria.model;

public class LivroFisico extends Livro {

	private String tipoDeCapa;

	public LivroFisico(String titulo, double valor, int numeroLivro, String autor, String tipoDeCapa) {
		super(titulo, valor, numeroLivro, autor);
		this.tipoDeCapa = tipoDeCapa;
	}

	public String getTipoDeCapa() {
		return tipoDeCapa;
	}

	public void setTipoDeCapa(String tipoDeCapa) {
		this.tipoDeCapa = tipoDeCapa;
	}
	
	@Override
	public void visualizarLivro() {
	    super.visualizarLivro();
		System.out.println("Tipo de Capa: " + tipoDeCapa);
		System.out.println("Tipo do Livro: Livro Físico");
	}
}
