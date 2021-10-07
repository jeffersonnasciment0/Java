package atividades;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
//		area = (b*h)/2
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da base: ");
		Double base = entrada.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		Double altura = entrada.nextDouble();
		
		
		Double area = (base*altura)/2;
		
		System.out.println("A area deste Triâgulo é: " + area + " cm2");
		
		
		entrada.close();
	}
}
