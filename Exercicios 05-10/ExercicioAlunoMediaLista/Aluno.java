package ExerciciosAula9;

public class Aluno {

	/*Criar uma classe Aluno com os atributos nome, nota1, e nota2.
	• Criar construtor e getters.
	• Criar um método calcularMedia que deverá retornar um double do cálculo da média*/
	
	private String nome;
	private Double nota1;
	private Double nota2;
	
	
	public Aluno(String nome, Double nota1, Double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getNota1() {
		return nota1;
	}


	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}


	public Double getNota2() {
		return nota2;
	}


	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	//Lançar uma exceção caso a primeira ou segunda nota for menor que zero ou superior a dez
	public Double mediaNota() throws NumeroInvalidoException {
		double media =0.;
		media = (this.nota1 + this.nota2)/2;
		
		if(this.nota1>10 || this.nota1<0 || this.nota2>10 || this.nota2<0) {
			
			throw new NumeroInvalidoException("Este número não está entre 0 e 10! ");
			
		} 
		media = (this.nota1 + this.nota2)/2;
		return media;
		}
	
	public String toString() {
		
		return "Nome: " + this.getNome() + " | Nota 1: " + this.getNota1() + " | Nota 2: " + this.getNota2();
	}
	
}
	
	

