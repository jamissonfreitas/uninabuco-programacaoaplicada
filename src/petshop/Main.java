package petshop;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("james", "12345678");
		Cachorro cao1 = new Cachorro("peludo", cliente1, "vira-lata");
		Gato gato1 = new Gato("miau", cliente1, "vira-lata");
		System.out.println(cliente1.getCusto());
		
		Servico tosa = new Tosa(20);
		tosa.executar(cao1);
		tosa.executar(gato1);
		System.out.println(cliente1.getCusto());
		
		

	}

}
