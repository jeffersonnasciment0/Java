package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nPara sair, digite -1.");
		
//		int sair = 1;
		double NotaAtual = 0;
		double SomaNota = 0; 
		int contador = 0; 
		
		while(NotaAtual != -1 ) {
	
				System.out.print("\nDigite a nota: ");
				NotaAtual = entrada.nextDouble();
				if(NotaAtual <= 10 && NotaAtual >= 0 ) {
					SomaNota += NotaAtual;
					contador ++;
				}
				else
					System.out.println("\nNota Invalida !\nDigite outra nota !");
				
				
		}
		
//		if(NotaAtual != -1) {
//			System.out.println("Soma atual de notas: " + SomaNota);
//			System.out.println("Total de provas Cadastradas até agora -> " + contador);
//		}else 
//			System.out.println("----------------");
//			System.out.println("\nLooping Terminado !!");
//		contador --;
		double media = SomaNota / contador;
		System.out.println("\nQuantidade de notas cadastradas até agora: " + contador);
		System.out.println("Somas das notas cadastradas até agora: " + SomaNota);
		System.out.println("Somas das notas cadastradas até agora: " + media);
		
		entrada.close();
		
	}
}
