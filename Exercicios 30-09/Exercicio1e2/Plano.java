package ExerciciosAula5;

public class Plano {

	protected String empresa;
	protected Double valorPago = 80.;
	protected Double valorIss = 5.;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}
	
	public Double getValorPago() {
		return this.valorPago;
	}
	
	public Double calcularPagamento() {
		
		return this.valorPago = this.valorPago - this.valorPago*(this.valorIss/100);
	}
	
	@Override
	public String toString() {
		
		return " Plano: " + this.empresa;
	}
}
