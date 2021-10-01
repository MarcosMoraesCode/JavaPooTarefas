package ExerciciosAula5;

public class Clinica extends Plano {
	
	private String nome;
	private String cgc;
	
	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " | Clinica: " + this.nome;
	}
	
	public String getCgc(String cgc) {
		
		return this.cgc;
	}
	public String getNome(String nome) {
		
		return this.nome;
	}
	

}
