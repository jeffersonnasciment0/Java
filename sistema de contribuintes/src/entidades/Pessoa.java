package entidades;

public class Pessoa {

	private String nome;
	private double rendaAnual;
	private double percentualImposto;
	private double imposto;
	
	public Pessoa(String nome, double rendaAnual) {
		setNome(nome);
		setRendaAnual(rendaAnual);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public double getPercentualImposto() {
		return percentualImposto;
	}

	public void setPercentualImposto(double percentualImposto) {
		this.percentualImposto = percentualImposto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public String toString() {
		return "\nnome: " + nome + " \nRenda Anual: " + rendaAnual;
	}
}
