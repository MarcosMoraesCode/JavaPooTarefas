package ExerciciosAula4;

public class Funcionario {

	protected String nome;
	protected String cpf;
	protected Double salario;
	protected String turno;
	
	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	/*
	public String toString() {
		
		return String.format("Nome: %s, " + this.nome + "Salario: %.2f" + this.salario);
		
		
	}*/
	
	public void AdicionarBonus() {
		
		this.salario = this.salario*1.01; 
	}
}
