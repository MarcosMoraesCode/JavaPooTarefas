package ExerciciosAula4;

public class Gerente extends Funcionario {
	
	private String nivel;

	
	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}
	
public void AdicionarBonus() {
		
		this.salario = this.salario*1.01 + 200.0; 
	}
	
	
	

}
