package petshop;

public class Cliente {
	private String nome;
	private String telefone;
	private double custo;
	
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.custo = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo += custo;
	}
}
