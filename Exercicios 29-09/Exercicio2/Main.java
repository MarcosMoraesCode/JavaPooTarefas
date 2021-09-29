package ExerciciosAula4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido pedido1 = new Pedido(1,5,3.0);
		Pedido pedido2 = new Pedido(1,20,13.0);
		Pedido pedido3 = new Pedido(1,52,2.4);
		
		System.out.println(String.format("O total do seu pedido é: %.2f", pedido1.TotalPedido()));
		System.out.println(String.format("O total do seu pedido é: %.2f", pedido2.TotalPedido()));
		System.out.println(String.format("O total do seu pedido é: %.2f", pedido3.TotalPedido()));
		
	}

}
