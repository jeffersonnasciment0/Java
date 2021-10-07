package atividades;

import java.util.Scanner;

public class ConversorCelsiusFahrenheit {

	public static void main(String[] args) {
//		(0 °C × 9/5) + 32 = 32 °F
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em celsius: ");
		Double celsius = entrada.nextDouble();
		Double Fahrenheit = ((9.0/5) * celsius) + 32;
		
		System.out.println("Graus Celsius: " + celsius + "Grau Fahrenheit: " + Fahrenheit);
		
		entrada.close();
	}
}
