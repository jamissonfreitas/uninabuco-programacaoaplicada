package petshop;

public class Servico {
	private double preco;
	
	public Servico(double preco) {
		this.preco = preco;
	}
	
	public void executar(Pet pet) {
		if(pet instanceof Cachorro)
			pet.getResponsavel().setCusto(1.2 * this.preco);
		else
			pet.getResponsavel().setCusto(this.preco);
	}

}
