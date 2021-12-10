package entidades;

public class PessoaJuridica extends Pessoa implements Contribuintes{

	private int numeroFuncionarios;
	private final int minimoFuncionarios = 10;
	
	public double pagarImposto() {
		
		if(numeroFuncionarios > minimoFuncionarios) {
			setPercentualImposto(0.14);
			setImposto(getRendaAnual() * getPercentualImposto());
			return getImposto();
		}
		
	setPercentualImposto(0.16);
	setImposto(getRendaAnual() * getPercentualImposto());
	return getImposto();
	};
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		setNumeroFuncionarios(numeroFuncionarios);
	}

	public double getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public String toString() {
		return "\nnome (Empresa): " + super.getNome() 
		+ "\nRenda Anual: " + super.getRendaAnual() + " R$" 
		+ "\nNumero de funcionários da empresa: " + numeroFuncionarios
		+ "\nImposto a pagar: " + pagarImposto() + " R$\n";
	}
	
	
}
