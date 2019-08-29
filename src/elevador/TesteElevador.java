package elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(5, 3);
		elevador.status();
		elevador.desce();
		elevador.status();
		
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.status();
		
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.status();
	}

}
