package ExerciciosAula5;

public class ControlePagamento {

	private Double totalPago =0.0;

	public Double getTotalPago() {
		return totalPago;
	}
	
	public void calcularTotalPago(Plano plano) {
		this.totalPago += plano.getValorPago();
	}
	@Override
	public String toString() {
		return " O valor total pago pelo plano é " + this.totalPago;
	}
}
