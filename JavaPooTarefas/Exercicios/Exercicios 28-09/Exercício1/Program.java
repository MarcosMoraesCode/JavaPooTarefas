package exercicioaula3;

/*
- Construa dois objetos em uma outra classe com o nome MainImovel com os seguintes dados:
1, “Centro”,”apto”,25000.
2,”Quitandinha”,”casa”,98900.

CRIEI UM PROGRAM.JAVA QUE REALIZA EXATAMENTE O QUE FOI PEDIDO, PARA MANTER O PADRÃO DAS AULAS
*/

public class Program {

	public static void main(String[] args) {
		
		Imovel mainimovel = new Imovel(1,"Centro", "apto", 25000.00);
		Imovel mainimovel2 = new Imovel(2,"Quitandinha", "casa", 98900.00);
		
		mainimovel.Reajuste();
		mainimovel2.Reajuste();
		mainimovel.mostraCategoria();
		mainimovel2.mostraCategoria();
		
		System.out.println(String.format("\n Codigo: " + mainimovel.codimovel + "\n Bairro: "+ mainimovel.bairro +
				"\n Tipo: " + mainimovel.tipo + "\n Valor: " + mainimovel.valor));
		
		System.out.println("\n Categoria: " + mainimovel.categoria);
		
		System.out.println(String.format("\n Codigo: " + mainimovel2.codimovel + "\n Bairro: "+ mainimovel2.bairro +  
				"\n Tipo: " + mainimovel2.tipo + "\n Valor: " + mainimovel2.valor));
		
		System.out.println("\n Categoria: " + mainimovel2.categoria);
		
	}
}
