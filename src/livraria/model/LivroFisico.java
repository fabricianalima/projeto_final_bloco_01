package livraria.model;

public class LivroFisico extends Livro {

	private String tipoDeCapa;

	public LivroFisico(int numeroLivro, String titulo, double valor, String autor, String tipoDeCapa) {
		super(numeroLivro,titulo, valor, autor);
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
