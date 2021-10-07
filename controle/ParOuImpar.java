package controle;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o n�emro:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0)
			System.out.println("numero par");
		else
			System.out.println("numero impar");
	}
}
