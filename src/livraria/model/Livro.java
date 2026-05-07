package livraria.model;

public abstract class Livro {

	private int numeroLivro;
	private String titulo;
	private double valor;
	private String autor;
	

	public Livro(int numeroLivro, String titulo, double valor, String autor) {
		this.titulo = titulo;
		this.valor = valor;
		this.autor = autor;
		this.numeroLivro = numeroLivro;
	}

	public int getNumeroLivro() {
		return numeroLivro;
	}

	public void setNumeroLivro(int numeroLivro) {
		this.numeroLivro = numeroLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}



	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void visualizarLivro() {

		System.out.println("Mostrando detalhes do livro: ");
		System.out.println("Nome: " + titulo);
		System.out.println("Autor do Livro: " + autor);
		System.out.println("Valor: " + valor);
		System.out.println("Número do livro: " + numeroLivro);

}
}