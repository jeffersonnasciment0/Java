package provas;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int cont = 0;
		
		// Entrada de dados do usu�rio
		System.out.print("Digite o valor do sal�rio minimo: ");
		double SalarioMinimo = entrada.nextDouble();
		double DoubroSalario = 2 * SalarioMinimo;
		
		System.out.print("Digite o valor do sal�rio minimo: ");
		double SalarioUsuario = entrada.nextDouble();
		
		// Condi��es de n�o SM e SM = 1
		if(SalarioUsuario < SalarioMinimo){
			System.out.println("\nVoc� n�o recebe sal�rio minimo. ");
		}else if(SalarioUsuario == SalarioMinimo || SalarioUsuario < DoubroSalario) {
			cont++;
			System.out.println("\nVoc� recebe " + cont + " Sal�rio minimo.");
		}
		
		// Ponto de mudan�a na contagem de SM
		double DiferencaSalario = SalarioUsuario - SalarioMinimo;
		
		// Contagem de SM enquanto diferen�a de sal�rio � menor que Salario minimo 
		while(DiferencaSalario >= SalarioMinimo ){
			DiferencaSalario = SalarioUsuario - SalarioMinimo; 
			SalarioUsuario = DiferencaSalario;
			cont ++;
		}
		
		// Condi��o para que n�o imprima duplicata com SM = 1
		if(cont != 1)
			System.out.println("\nVoc� recebe " + cont + " Sal�rios m�nimos.");
		
		// Encerramento de entrada de dados.
		entrada.close();
	}
}
