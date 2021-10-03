package ExerciciosAula6;

public abstract class Produto implements Venda{
	
	private String nome;
	private Double valor;
	
	
	
	
	public Produto(String nome, Double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}



	@Override
	public Double vender(Integer quantidadeDeItens) {
		// TODO Auto-generated method stub
		return null;
	}



	


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		
		return " Produto: " + this.nome;
	}
}






/*
1 - 
Todos os atributos são privados - implementem getters e setters.
Tudo é definido na criação, dentro do construtor.


Produto abstrato e implementa (interface) Venda
- Nome
- Valor

Bebida alcoolica herda de produto
- Teor alcoolico

Eletrodomestico herda de produto
- Voltagem

Interface Venda
double Vender(int quantidadeDeItens)

Na main, crie 5 produtos:
Nome: Cerveja - 12 reais
Nome: Vinho - 150 reais
Nome: Tv - 2000 reais
Nome: Geladeira - 2352.64 reais
Nome: Radio - 837.59

Faça uma venda para cada produto.
Cerveja, compre 5
Vinho, compre 3
Tv, compre 9
Geladeira, compre 3
Radio, compre 1

Mostre em tela o valor total.
Mostre todos os produtos, após realizar um toString.*/