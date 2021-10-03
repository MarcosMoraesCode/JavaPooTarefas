package ExercicioSlide7;

import java.time.LocalDate;

public class Carro extends Veiculo{
	
	private String categoria;
	
	public Carro(String categoria, String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public Double lavarVeiculo() {
		
		return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}
	@Override
	public Double trocarOleo() {
		if (dataConserto.getDayOfWeek().getValue() == 6) {
			valorCobrado += 50.;
		}else {
			valorCobrado += TipoServico.OLEO.getValorPorServico();
		}
			
		return valorCobrado;
	}

	@Override
	public Double revisao() {
		if(dataConserto.getMonthValue() == 9 ) {
			valorCobrado += TipoServico.REVISAO.getValorPorServico()*0.9;
		}else {
			valorCobrado += TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
	}
	public String toString() {
		return super.toString() + " | Categoria: " + this.categoria;
	}
}
