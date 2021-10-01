package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int limite = 0;
		
		while(limite < 100) {
			System.out.printf("i = %d\n", limite);
			limite += 2;
		}
	}
}
