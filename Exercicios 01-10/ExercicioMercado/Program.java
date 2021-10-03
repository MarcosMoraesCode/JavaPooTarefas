package ExerciciosAula6;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double eletro;
		double bebida;
				
		Produto produto1 = new BebidaAlcoolica("Cerveja", 12.0, 0.05);
		Produto produto2 = new BebidaAlcoolica("Vinho", 150.0, 0.16);
		Produto produto3 = new Eletrodomestico("TV", 2000.0, " 110V ");
		Produto produto4 = new Eletrodomestico("Geladeira", 2352.64, " Bivolt ");
		Produto produto5 = new Eletrodomestico("Radio", 837.59, " 220V ");
		
		System.out.println("Produtos Cadastrados: ");
		System.out.println(produto1.toString());
		System.out.println(produto2.toString());
		System.out.println(produto3.toString());
		System.out.println(produto4.toString());
		System.out.println(produto5.toString());
		
		produto1.vender(5);
		eletro = produto2.vender(3);
		produto3.vender(9);
		produto4.vender(3);
		bebida = produto5.vender(1);
		
		
		
		
		System.out.println("Valor total a pagar: R$ " +(eletro + bebida));
		
		
		
		
		
		
		

	}

}
