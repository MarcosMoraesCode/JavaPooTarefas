package ExerciciosAula5;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	
	private String nome;
	private Endereco endereco;
	private List <Telefone> telefones;
	
		
	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = new ArrayList<Telefone>();
	}



	public void addTelefones(Telefone telefones) {
		this.telefones.add(telefones);
	}
	
	public void mostrarTelefones() {
		
		System.out.println(this.telefones);
	}



	public String getNome() {
		return this.nome;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public List<Telefone> getTelefones() {
		return this.telefones;
	}
	
	public String toString() {
		
		return " Nome: " + this.nome;
	}
	
	
	

}
