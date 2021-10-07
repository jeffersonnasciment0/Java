package provas;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		
		// Entrada de dados do usuário
		System.out.print("Digite o valor do salário minimo: ");
		double SalarioMinimo = entrada.nextDouble();
		double DoubroSalario = 2 * SalarioMinimo;
		
		System.out.print("Digite o valor do salário minimo: ");
		double SalarioUsuario = entrada.nextDouble();
		
		// Condições de não SM e SM = 1
		if(SalarioUsuario < SalarioMinimo){
			System.out.println("\nVocê não recebe salário minimo. ");
		}else if(SalarioUsuario == SalarioMinimo || SalarioUsuario < DoubroSalario) {
			cont++;
			System.out.println("\nVocê recebe " + cont + " Salário minimo.");
		}
		
		// Ponto de mudança na contagem de SM
		double DiferencaSalario = SalarioUsuario - SalarioMinimo;
		
		// Contagem de SM enquanto diferença de salário é menor que Salario minimo 
		while(DiferencaSalario >= SalarioMinimo ){
			DiferencaSalario = SalarioUsuario - SalarioMinimo; 
			SalarioUsuario = DiferencaSalario;
			cont ++;
		}
		
		// Condição para que não imprima duplicata com SM = 1
		if(cont != 1)
			System.out.println("\nVocê recebe " + cont + " Salários mínimos.");
		
		// Encerramento de entrada de dados.
		entrada.close();
	}
}
