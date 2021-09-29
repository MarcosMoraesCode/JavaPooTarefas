package ExerciciosAula4;

public class ImpostoDeRenda {
	
	protected String nome;
	protected String telefone;
	protected String email;
	protected Double rendimentos;
	
	
	public ImpostoDeRenda(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	public Double calculoIR() {
		
		
		return this.rendimentos*1;
			
		
	}
}
