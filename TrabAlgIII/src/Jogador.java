import java.util.ArrayList;



public class Jogador {
	
	
	private String nome;
	private String[] mao = new String[7];
	private int totalDeCartas = 0;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String toString(){
		return this.nome;
	}
	
	public boolean equals(Object o){
		Jogador outro = (Jogador)o;
		return this.nome.equals(outro.nome);
	}

	public void adiciona(String cartas){
		this.mao[this.totalDeCartas] = cartas;
		this.totalDeCartas++;
	}
	
	
}
