package modelo;

public class Autor extends Pessoa{
	
    public int id;
	
	public Autor(int id, String nome, int idade, Endereco endereco) {
		super(nome, nome, endereco, idade);
		this.id = id;
	}

	public Autor(String nome) {
		super(nome);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
}
