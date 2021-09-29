package ExerciciosAula4;

import java.time.*;
  	/*Criar uma classe pedido com os seguintes atributos:
  	- numero (int)
  	- dataPedido (LocalDate)
  	- quantidade (double)
  	- valor (double)
  	- total (double)
  	 */

public class Pedido {
	
	private Integer numero;
	LocalDate dataPedido = LocalDate.now();
	private Integer quantidade;
	private Double valor;
	private Double total;
	
	
	//Inserir o construtor com os atributos numero, dataPedido, quantidade e valor:
	
	public Pedido(Integer numero, Integer quantidade, Double valor) {
		super();
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	
	/*Criar um método para finalizar o pedido que caso o dia do pedido for um domingo
	o cliente terá um desconto de 10% no valor do pedido.
	*/
	
	public Double TotalPedido() {
		
				
		if( this.dataPedido.getDayOfWeek().getValue() == 7) {
			
			this.total = this.quantidade*this.valor*0.9;
					
		}else { 
			
			this.total = this.quantidade*this.valor;
		}
	
		return this.total;
		
	}
	
	//Inserir os getters	
	public Integer getNumero() {
		return numero;
	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public Double getValor() {
		return valor;
	}
	
	
	
	
	

}
