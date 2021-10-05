package ExerciciosAula9;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private Double salario;
	
	
	
	public Funcionario(String nome, String cargo, Double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double abonoSalario() {
		Double abono = getSalario()*0.15;
		return abono;
			
	}
	
	public String toString() {
		
		return 	String.format("Nome: %s | Cargo: %s | Salário: %.2f | Abono: %.2f", this.nome, this.cargo, this.salario, this.abonoSalario() );
		
	}

}
