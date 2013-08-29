import java.util.Random;
import java.util.Vector;



public class MainJogoCartas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JogoCartas lista = new JogoCartas();
		Baralho baralhoList = new Baralho();
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
		
		j1.setNome("Fernando");
		j2.setNome("Ana");
		j3.setNome("Claudia");
		j4.setNome("João");
		
		lista.adiciona(j1);
		lista.adiciona(j2);
		lista.adiciona(j3);
		lista.adiciona(j4);
		Random r = new Random();
		
		String[] cartas = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
		           "Valete", "Dama", "Rei" };
        String[] nipes = { "Espadas", "Paus", "Copas", "Ouros" };

        for (int i = 0; i < cartas.length; i++) {			
        	String aux = cartas[i] + nipes[0];
        	String aux1 = cartas[i] + nipes[1];
        	String aux2 = cartas[i] + nipes[2];
        	String aux3 = cartas[i] + nipes[3];
        	
        	baralhoList.adiciona(aux);
        	baralhoList.adiciona(aux1);
        	baralhoList.adiciona(aux2);
        	baralhoList.adiciona(aux3);
		}
        
        /*for (int i = 0; i < baralhoList.tamanho(); i++) {
        	int indiceNipe = r.nextInt(baralhoList.tamanho());
    		String nipe = nipes[indiceNipe];
    		j1.adiciona(nipe);
    		
		}*/
        
        
        System.out.println(j1.toString());

        baralhoList.exibir();
        System.out.println(baralhoList.tamanho());
        
        
       
        
	}

}
