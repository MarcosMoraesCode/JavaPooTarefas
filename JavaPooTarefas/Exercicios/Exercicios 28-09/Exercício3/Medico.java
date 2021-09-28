package exercicioaula3;

/*
Criar uma classe com o nome Medico
- atributos da classe Medico: crm, nome e salario e valor da consulta
*/

public class Medico {

	Integer crm;
	String nome;
	Double salario;
	Double valorConsulta;
	static Integer numMedicos = 0;
	
	/*Crie um construtor vazio e outro com todos os dados da conta na classe Medico.*/
	
	public Medico() {
		
	}
	
	
	public Medico(Integer crm, String nome, Double salario, Double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		Medico.numMedicos +=1;
		}
	
	/*Crie um método pagamentoDinheiro na classe Medico para pagamentos em dinheiro.*/
	
	public void pagamentoDim() {
		Double desconto = 0.0;
		desconto = this.valorConsulta;
		System.out.println("O valor recebido será: " + desconto);
		
	}
	
	/*Crie o método pagamentoPlano na classe Medico para pagamentos com plano de saúde
	Obs: O médico receberá 70% do valor da consulta por plano de saúde.*/
	
	public void pagamentoPlano() {
		Double desconto = 0.0;
		desconto = this.valorConsulta*0.7;
		System.out.println("O valor recebido será: " + desconto);
	
	}
}
