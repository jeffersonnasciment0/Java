package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nPara sair, digite sair.");
		
		String sair = "desativo";
		while(!sair.equalsIgnoreCase("sair")) {
			System.out.print("\nDigite Qualquer coisa: ");
			sair = entrada.nextLine();
			if(!"sair".equalsIgnoreCase(sair))
					System.out.println(sair);
			else 
				System.out.println("----------------");
				System.out.println("\nLooping Terminado !!");
		
		}
		
		
		
		
		
		entrada.close();
		
	}
}
