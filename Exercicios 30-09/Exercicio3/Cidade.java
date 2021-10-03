package ExerciciosAula5;

public class Cidade {
	
	private String nomeCidade;
	private Estado nomeEstado;
	
	
	public Cidade(String nomeCidade, Estado nomeEstado) {
		super();
		this.nomeCidade = nomeCidade;
		this.nomeEstado = nomeEstado;
	}


	public String getNomeCidade() {
		return nomeCidade;
	}


	public Estado getNomeEstado() {
		return nomeEstado;
	}
	
	@Override
	public String toString() {
		return " Estado: " + this.nomeEstado + " - " + nomeEstado.getSigla() + " | Cidade: " + this.nomeCidade;
	}
	

}
