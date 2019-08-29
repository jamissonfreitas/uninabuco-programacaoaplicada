package petshop;

public class Pet {
	private String nome;
	private Cliente responsavel;
	private String raca;
	
	public Pet(String nome, Cliente responsavel, String raca) {
		this.nome = nome;
		this.responsavel = responsavel;
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cliente getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Cliente responsavel) {
		this.responsavel = responsavel;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
