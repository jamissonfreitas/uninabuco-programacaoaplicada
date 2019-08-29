package elevador;

public class Elevador implements InterfaceElevador {
	private int andar_atual;
	private int total_andares;
	private int capacidade;
	private int qtd_pessoas;
	
	public Elevador(int capacidade, int total_andares) {
		this.andar_atual = 0;
		this.qtd_pessoas = 0;
		this.capacidade = capacidade;
		this.total_andares = total_andares;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public int getTotalAndares() {
		return this.total_andares;
	}

	@Override
	public boolean entra() {
		if(this.qtd_pessoas < this.capacidade) {
			this.qtd_pessoas++;
			return true;
		}
		return false;
	}

	@Override
	public boolean sai() {
		if(this.qtd_pessoas > 0) {
			this.qtd_pessoas--;
			return true;
		}
		return false;
	}

	@Override
	public boolean sobe() {
		if(this.andar_atual < this.total_andares) {
			this.andar_atual++;
			return true;
		}
		return false;
	}

	@Override
	public boolean desce() {
		if(this.andar_atual > 0) {
			this.andar_atual--;
			return true;
		}
		return false;
	}
	
	public void status() {
		System.out.println("Andar atual: " + this.andar_atual + ", Qtd pessoas: " + this.qtd_pessoas);
	}

}
