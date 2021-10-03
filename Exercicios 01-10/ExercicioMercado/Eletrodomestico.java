package ExerciciosAula6;


public class Eletrodomestico extends Produto{
	
	private String voltagem;
	private static double total;
	
	
	

	public static double getTotal() {
		return total;
	}



	public static void setTotal(double total) {
		Eletrodomestico.total = total;
	}



	public Eletrodomestico(String nome, Double valor, String voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}



	public String getVoltagem() {
		return voltagem;
	}




	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	
	public String toString() {
		
		return super.getNome() + " | Voltagem: " +this.voltagem;
	}



	@Override
	public Double vender(Integer quantidadeDeItens) {
		// TODO Auto-generated method stub
		total += quantidadeDeItens*super.getValor();
		return total;
		}
		

}
