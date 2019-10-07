package modelo;

public class Livro {

   
    public int id;
    private String titulo;
    private String genero;
    private Autor autor;
    private Editora editora;

	public Livro(int id, String titulo, String genero, Autor autor, Editora editora) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.editora = editora;
	}


	public Livro() {

	
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public Autor getAutor() {
		return autor;
	}



	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public Editora getEditora() {
		return editora;
	}


	public void setEditora(Editora editora) {
		this.editora = editora;
	}


	public void remove(int i) {

		
	}
   
}
