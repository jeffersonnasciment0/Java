package fundamentos;

public class AreaCircuferencia {
	
	
	public static void main(String[] args) {
		/* System.out.println(2+3+4); */
		/*
		 * Como definimos uma vari�vel em java ? 
		 * 1. definimos seu tipo
		 * 2. nome da vari�vel
		 * 3. valor  
		 */
		
//		int raio = 3;
		double raio2 = 3.4;
		final double PI = 3.14159; // final -> � utlizado para definimos uma constante / Por conven��o todas constantes s�o com Letras mai�sculas 
		
		double area = PI*raio2*raio2;
		
		System.out.println("Resultado da Area = " + area + " M2");
		
	}
}
