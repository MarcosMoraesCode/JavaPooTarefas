package ExerciciosAula4;

public class PessoaFisica extends ImpostoDeRenda {

	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, Double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
public Double calculoIR() {
		
		
		return this.rendimentos*0.12;
			
		
	}
}
