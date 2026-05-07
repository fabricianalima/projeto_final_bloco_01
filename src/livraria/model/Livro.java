package livraria.model;

public abstract class Livro {

	private String titulo;
	private double valor;
	private int numeroLivro;
	private String autor;
	

	public Livro(String titulo, double valor, int numeroLivro, String autor) {
		this.titulo = titulo;
		this.valor = valor;
		this.numeroLivro = numeroLivro;
		this.autor = autor;
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

	public int getNumeroLivro() {
		return numeroLivro;
	}

	public void setNumeroLivro(int numeroLivro) {
		this.numeroLivro = numeroLivro;
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
		System.out.println("Número do Livro: " + numeroLivro);
}
}