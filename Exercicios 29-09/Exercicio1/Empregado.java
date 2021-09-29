package ExerciciosAula4;

/*1) Crie uma classe chamada Empregado que inclui as três informações a seguir como atributos:
• nome
•sobrenome
•salario
Sua classe deve ter um construtor que inicializa os três atributos.
Forneça um método set e get para cada atributo.
*/

public class Empregado {
	
	private String nome;
	private String sobrenome;
	private Double salario;
			
	public Empregado(String nome, String sobrenome, Double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	//Crie um método calculaImpostoRenda para descontar no salário de acordo com a tabela:
	
	public Double CalculaImpostoRenda(Double resultado) {
		
		if(this.salario<1903.98) {
			
			resultado = salario;
			
		} else if(this.salario<2826.65){
			
			resultado = salario*0.925;
					
		} else if(this.salario<3751.05){
			
			resultado = salario*0.85;
			
		}
		  else if(this.salario<4664.68){
				
				resultado = salario*0.775;
		} else {
			
				resultado = salario*0.725;
		}
		return resultado;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
