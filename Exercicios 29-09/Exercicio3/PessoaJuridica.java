package ExerciciosAula4;

public class PessoaJuridica extends ImpostoDeRenda{
	
	private String cnpj;
	private String inscEstadual;
	
	
	public PessoaJuridica(String nome, Double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	
public Double calculoIR() {
		
		
		return this.rendimentos*0.15;
			
		
	}
	
	
	

}
