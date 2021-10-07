package atividades;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o raio da circuferência: ");
		Double raio = entrada.nextDouble();
		
		final double PI = 3.14159; 	
		double area = PI*(raio*raio);
		
		System.out.println("Resultado da Area do circulo = " + area + "m2");
		
		entrada.close();
	}
}
