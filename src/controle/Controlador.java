package controle;

import java.util.ArrayList;

import modelo.Autor;
import modelo.Editora;
import modelo.Livro;

public class Controlador {

	private ArrayList<Livro> livros;

	public Controlador() {
	
		livros = new ArrayList<>();
	}

	public void adicionarLivros(Livro livro) {
		livros.add(livro);
		System.out.println("Livro Cadastrado com Sucesso");
	}

	public void buscar(int id) {
		for (Livro livro : livros) {
			if (livro.getId() == id) {
				System.out.println("Dados do Livro Encontrado");
				System.out.println("Título do Livro: " + livro.getTitulo());
				System.out.println("Gênero do Livro: " + livro.getGenero());
				System.out.println("Autor do Livro: " + livro.getAutor().getNome());
				System.out.println("Editora do Livro: " + livro.getEditora().getNome());
				System.out.println("------------------------------------------------------");
			}
		}
	}
	
	public boolean verificarSeLivroExiste(int idLivro) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getId() == idLivro) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean removeLivro(int idLivro) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getId() == idLivro) {
				livros.remove(i);
				return true;
			}
		}
		return false;
	}

	public void listarLivros() {

		for (Livro livro : livros) {
			System.out.println("Dados do Livro Encontrado");
			System.out.println("Título do Livro: " + livro.getTitulo());
			System.out.println("Gênero do Livro: " + livro.getGenero());
			System.out.println("Autor do Livro: " + livro.getAutor().getNome());
			System.out.println("Editora do Livro: " + livro.getEditora().getNome());
			System.out.println("------------------------------------------------------");
			
		}
		
	}

	public void editarLivro(int id, String titulo, String genero, Autor autor, Editora editora) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getId() == id) {
				livros.get(i).setTitulo(titulo);
				livros.get(i).setGenero(genero);
				livros.get(i).setAutor(autor);
				livros.get(i).setEditora(editora);

			}
		}

	}

 
}

