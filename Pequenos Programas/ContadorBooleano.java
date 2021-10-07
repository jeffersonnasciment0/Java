package provas;

import java.util.Scanner;

public class ContadorBooleano {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		int cont = 0;
		
		// Declaração e iniciação de vetor bools
		boolean bools[] = new boolean[5];
		while(n<=4) {
			// Entrada de dados pelo usuário
			System.out.print("Digite true ou false: ");
			bools[n] = entrada.nextBoolean();
			
				// Acionamento de contagem de true 
				if(bools[n] == true)
					cont++;
			
			n++;
		}
		
		if(cont != 1)
			System.out.println("\nAo todo foram " + cont + " Valores true.");
		else
			System.out.println("\nAo todo foi apenas " + cont + " Valor true.");
			
		
		entrada.close();
	}
}
