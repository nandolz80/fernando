import java.util.Arrays;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[][] pessoa = {{"Fernando","M","RS"},{"Ana","F","RS"}};

		for(int i=0;i<pessoa.length;i++){
			System.out.println(Arrays.toString(pessoa[i]));
		}
		
		System.out.println(Arrays.toString(pessoa[0]));
	}

}
