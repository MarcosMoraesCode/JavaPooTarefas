package exercicioaula3;

/*1) Crie uma classe com o nome Imovel com os atributos e métodos abaixo:
- atributos:
- codImovel,
- bairro
- tipo
- valor */

public class Imovel {
	
	Integer codimovel;
	String bairro;
	String tipo;
	Double valor;
	String categoria;
	
	public Imovel(Integer codimovel, String bairro, String tipo, Double valor) {
		super();
		this.codimovel = codimovel;
		this.bairro = bairro;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	
		/*-Métodos
		- Crie um método para calcular o reajuste para casa 5% e para apto 8%
		 */
	
	public void Reajuste() {
		
		if(this.tipo == "casa") {
			
			this.valor = this.valor*1.05;
			
			System.out.println("O valor reajustado é: " + this.valor);
			
			
		}else if(this.tipo == "apto") {
			
			this.valor = this.valor*1.08;
			
			System.out.println("O valor reajustado é: " + this.valor);
		}
		
	}
	
		/*- Métodos
		Crie um método para mostra a categoria do imóvel:
		Categoria A - acima de 50000
		Categoria B - a partir de 10000 e menor que 50000
		Categoria C - valores inferiors a 10000
		 */
	
	public String mostraCategoria() {
		
				
		if(this.valor>50000) {
			
			categoria = "A";
			
		} else if(this.valor>= 10000 && this.valor <50000) {
			
			categoria = "B";
			
		} else if(this.valor<10000) {
			
			categoria = "C";
			
		}
		
		return categoria;
		
		}
	
}