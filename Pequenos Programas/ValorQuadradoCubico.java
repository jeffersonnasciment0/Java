package atividades;

import java.util.Scanner;

public class ValorQuadradoCubico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		Double valor = entrada.nextDouble();
		
		Double ValorQuadrado = valor*valor;
		Double ValorCubico = valor*valor*valor;
		
		System.out.println("O quadrado de " + valor + " é: " + ValorQuadrado);
		System.out.println("O valor de " + valor + " ao cubo é: " + ValorCubico);
		
		entrada.close();
		
	}
}
