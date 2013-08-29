


public class JogoCartas {

		
	private Jogador[] jogador = new Jogador[4];
	private int totalDeJogadores = 0;

		
	public void adiciona(Jogador jogador){
		this.jogador[this.totalDeJogadores] = jogador;
		this.totalDeJogadores++;
	}

	

}

