package ExerciciosAula4;

public class Assistente extends Funcionario {
	
	private Double adicional;

	
	
	public Assistente(String nome, Double adicional, Double salario) {
		super(nome, salario);		
		this.adicional = adicional;
		
	}



	public void AdicionarBonus() {
		
		this.salario = this.salario*1.01 + adicional; 
	}
	

}
