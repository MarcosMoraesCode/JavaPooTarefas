package ExerciciosAula5;

public class Medico extends Plano {

	protected String nome;
	private Integer crm;
	
	
	public Medico(String empresa, String nome, Integer crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	public String toString() {
		
		return " | Nome do médico: " + this.nome;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCrm() {
		return crm;
	}
	
	@Override
	public Double calcularPagamento() {
		
		return valorPago = super.calcularPagamento()*1.1;
	}
}
