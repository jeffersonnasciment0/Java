package atividades;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
//		IMC = peso / (altura*altura)
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		Double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura em cm(exe:. 1,75): ");
		Double altura = entrada.nextDouble();
		
		Double IMC = peso / (altura*altura);
		
		System.out.format("Seu IMC é: %.4f kg/m2", IMC);
		
		entrada.close();
	}
}
