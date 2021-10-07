package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nPara sair, digite -1.");

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
		
		double media = SomaNota / contador;
		System.out.println("\nQuantidade de notas cadastradas at� agora: " + contador);
		System.out.println("Somas das notas cadastradas at� agora: " + SomaNota);
		System.out.println("Somas das notas cadastradas at� agora: " + media);
		
		entrada.close();
	}
}
