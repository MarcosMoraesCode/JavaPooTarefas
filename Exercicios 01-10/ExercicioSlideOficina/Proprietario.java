package ExercicioSlide7;

public class Proprietario {

	private String nome;
	
	
	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return this.nome;
	}


	public String toString() {
		
		return " Proprietário: " + this.nome;
	}
}
