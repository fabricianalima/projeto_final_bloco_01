package livraria.controller;

import java.util.ArrayList;
import java.util.List;

import livraria.model.Livro;
import livraria.repository.LivrariaRepository;

public class LivrariaController implements LivrariaRepository {
	
	private List<Livro> listaLivros = new ArrayList<Livro>();
	int numero = 0;

	@Override
	public void cadastrarLivro(Livro livro) {
		listaLivros.add(livro);
		System.out.printf("O livro número %d foi criado com sucesso!%n", livro.getNumeroLivro());
	}

	@Override
	public void listarLivro() {
		for (var livro : listaLivros) {
			livro.visualizarLivro();
		}
	}
	
	
	public void procurarLivroPorNumero(int numero) {
		var livro = buscarNaCollection(numero);
		
		if(livro !=  null) {
			livro.visualizarLivro();
		}else {
			System.out.printf("O livro número %d não foi encontrado !%n", numero);
		}
	}

	@Override
	public void atualizarLivro(Livro livro) {
    var buscaLivro = buscarNaCollection(livro.getNumeroLivro());
		
		if (buscaLivro != null) {
			listaLivros.set(listaLivros.indexOf(buscaLivro), livro);
			System.out.printf("O livro número %s foi atualizada com sucesso!%n", livro.getNumeroLivro());
			}else {
				System.out.printf("O livro número: %s não foi encontrado!%n", numero);
			}
	}
	

		@Override
		public void deletarLivro(int numeroLivro) {

		    var livro = buscarNaCollection(numeroLivro);

		    if (livro != null) {

		        listaLivros.remove(livro);

		        System.out.printf(
		            "O livro número %d foi deletado com sucesso!%n",
		            numeroLivro
		        );

		    } else {

		        System.out.printf(
		            "O livro número %d não foi encontrado!%n",
		            numeroLivro
		        );
		    }
	}
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Livro buscarNaCollection(int numero) {
		for (var livro : listaLivros) {
			if (livro.getNumeroLivro() == numero){
				return livro;
			}
		}
		return null;
}
}
