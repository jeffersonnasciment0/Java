package entidades;

public class PessoaFisica extends Pessoa implements Contribuintes{

	private double gastoSaude;
	private final double descontoSaude = 0.5;
	
	public double pagarImposto() {
		
		if( getRendaAnual() >= 20000) {
			setPercentualImposto(0.25);
			setImposto(getRendaAnual()* getPercentualImposto());
			
			if(gastoSaude != 0) {
				setImposto(getImposto() - (gastoSaude * descontoSaude));
				return getImposto();
			}
			return getImposto();
		}
		
		setPercentualImposto(0.15);
		setImposto(getRendaAnual() * getPercentualImposto());
		
		if(gastoSaude != 0) {
			setImposto(getImposto() - (gastoSaude * descontoSaude));
			return getImposto();
		}
		return getImposto();
	};
	
	
	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		setGastoSaude(gastoSaude);
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public String toString() {
		return "\nnome: " + super.getNome() 
		+ "\nRenda Anual: " + super.getRendaAnual() + " R$" 
		+ "\nGastos com saúde: " + gastoSaude + " R$"
		+ "\nImposto a pagar: " + pagarImposto() + " R$\n";
	}
}
