package ExercicioSlide7;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
	
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	public String toString() {
		
		return " | Modelo: " + this.modelo + " | Data: " + this.dataConserto;
	}
	
	public Double getValorCobrado() {
		return this.valorCobrado;
	}

	@Override
	public Double lavarVeiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double trocarOleo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double revisao() {
		// TODO Auto-generated method stub
		return null;
	}

}
