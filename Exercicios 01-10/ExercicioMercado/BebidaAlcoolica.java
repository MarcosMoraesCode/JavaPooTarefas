package ExerciciosAula6;



public class BebidaAlcoolica extends Produto{
	
	private Double teorAlcoolico;
	private static double total;
	
	
	public BebidaAlcoolica(String nome, Double valor, Double teorAlcoolico) {
		super(nome, valor);
		this.teorAlcoolico = teorAlcoolico;
		}



	@Override
	public Double vender(Integer quantidadeDeItens) {
		// TODO Auto-generated method stub
		total += quantidadeDeItens*super.getValor();
		
		return total;
		}


	public static double getTotal() {
		return total;
	}

	public Double getTeorAlcoolico() {
		return teorAlcoolico;
	}
	
	public String toString() {
		
		return super.getNome() + " | Teor Alcoolico: " +this.teorAlcoolico;
	}


	public void setTeorAlcoolico(Double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
		
			
		
		
}
