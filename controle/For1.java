package controle;

public class For1 {

	public static void main(String[] args) {
		
		
		
		for(int limite = 0 ; limite < 10 ; limite ++) {
			System.out.printf("i = %d\n", limite);
		}
		
		
		int limite = 0;
		for(; limite < 10 ;) {
			System.out.printf("i = %d\n", limite++); 
		}
	}
}
