package entidades;

import java.util.Arrays;
import java.util.List;

public class Governo {
	double total = 0;
	
	void totalArrecadado(List<Contribuintes> lista) {
		for(Contribuintes valor: lista) {
			total += valor.pagarImposto();
		} 			
		System.out.println("Governo:\nTotal arrecadado com impostos: " + total + " R$");
	}
	
	public static void main(String[] args) {
			
		
		Governo gov = new Governo();
		
		
		PessoaFisica pf1 = new PessoaFisica("João Ribeiro Duart", 85000, 2000);
		PessoaFisica pf2 = new PessoaFisica("Marcos Salomão Gilbertino", 18000, 3000);
		System.out.println(pf1);
		System.out.println(pf2);
		
		PessoaJuridica pj1 = new PessoaJuridica("Fabrica Feliz ltda", 500000, 15);
		PessoaJuridica pj2 = new PessoaJuridica("Empresa multi alegre ltda", 100000, 5);
		System.out.println(pj1);
		System.out.println(pj2);

		List<Contribuintes> contribuintesGoverno = Arrays.asList(pf1,pf2,pj1,pj2);
		
		gov.totalArrecadado(contribuintesGoverno);
		
	}
}
