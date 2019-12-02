package modelo;

public class Editora{
	
	private String nome;
	private Endereco endereco;
	
	public Editora(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;	
	}
	
	public Editora(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
