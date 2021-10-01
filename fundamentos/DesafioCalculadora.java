package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num 1
		// Ler num 2
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		Double num1 = entrada.nextDouble();
		
		System.out.println("Digite outro numero: ");
		Double num2 = entrada.nextDouble();
		
		
		System.out.println("Digite qual operação deseja realizar (+ - / * % ) ");
		String ope = entrada.next();
		
		Double resultado = "+".equals(ope) ? num1 + num2 : 0;
		resultado = "-".equals(ope) ? num1 - num2 : resultado;
		resultado = "*".equals(ope) ? num1 * num2 : resultado;		
		resultado = "/".equals(ope) ? num1 / num2 : resultado;
		resultado = "%".equals(ope) ? num2 % num1 : resultado;
		
		System.out.printf("%.2f %s %.2f = %f ", num1, ope, num2, resultado);
		entrada.close();
	}
}
