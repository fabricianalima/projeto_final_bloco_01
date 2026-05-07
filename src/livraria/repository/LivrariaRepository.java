package livraria.repository;

import livraria.model.Livro;

public interface LivrariaRepository {
	
	//Crud da Livraria
	public void cadastrarLivro(Livro livro);
	public void listarLivro();
	public void atualizarLivro(Livro livro);
	public void deletarLivro(int numeroLivro);
	
}
