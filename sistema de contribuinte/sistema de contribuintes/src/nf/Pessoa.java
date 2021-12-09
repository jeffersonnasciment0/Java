package nf;

public abstract class Pessoa {

	private String nome;
	private double rendaAnual;
	
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
	
	
	public String toString() {
		return "nome: " + nome + " Renda Anual: " + rendaAnual;
	}
}
