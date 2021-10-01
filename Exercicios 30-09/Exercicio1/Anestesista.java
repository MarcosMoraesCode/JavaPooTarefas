package ExerciciosAula5;

public class Anestesista extends Medico {
	
	private String tipoAnestesista;

	public Anestesista(String empresa, String nome, Integer crm, String tipoAnestesista) {
		super(empresa, nome, crm);
		this.tipoAnestesista = tipoAnestesista;
	}

	public String getTipoAnestesista() {
		return tipoAnestesista;
	}

	public void setTipoAnestesista(String tipoAnestesista) {
		this.tipoAnestesista = tipoAnestesista;
	}
	
	@Override
	
	public String toString() {
		
		return super.toString() + "Tipo de Anestesista: " + this.tipoAnestesista;
	}
	
	@Override
	
	public Double calcularPagamento() {
		
		return valorPago = super.calcularPagamento()*1.1 + 1000.0;
	}
}
