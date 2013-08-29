
public class Baralho {
	
	
	private String[] baralho = new String[52];
	private int totalDeCartas = 0;

		
	public void adiciona(String baralho){
		this.baralho[this.totalDeCartas] = baralho;
		this.totalDeCartas++;
	}

	public void exibir(){
		
		for (int i = 0; i < baralho.length; i++) {
			System.out.println(baralho[i]);
		}
		
	}
	
	public int tamanho(){
		return this.totalDeCartas;
		
	}
	
	
	
	

}
