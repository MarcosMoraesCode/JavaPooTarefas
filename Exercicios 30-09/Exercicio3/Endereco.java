package ExerciciosAula5;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cep;
	private Cidade nomeCidade;
	
	
	public Endereco(String rua, String bairro, String cep, Cidade nomeCidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.nomeCidade = nomeCidade;
	}


	public String getRua() {
		return rua;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCep() {
		return cep;
	}


	public Cidade getNomeCidade() {
		return nomeCidade;
	}
	
	@Override
	public String toString() {
		return nomeCidade.toString() +" | Bairro: "+ this.bairro + " | Rua : " + this.rua + " | CEP: " + this.cep;
	}

}
