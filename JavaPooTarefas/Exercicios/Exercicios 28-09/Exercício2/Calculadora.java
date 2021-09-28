package exercicioaula3;

public class Calculadora {
	
	
	public Double Calculando(Double num1, Double num2, Integer opcao) {
		
		Double resultado = 0.0;
		
		switch(opcao) {
		
		case(1): resultado = num1 + num2;
				 System.out.println("O resultado é: " + resultado );
				 break;
				 
		case(2): resultado = num1 - num2;
			  	 System.out.println("O resultado é: " + resultado );
		 		 break;
		 		 
		case(3): resultado = num1 * num2;
				 System.out.println("O resultado é: " + resultado );
		 		 break;
		 		 
		case(4): resultado= num1 / num2;
				 System.out.println("O resultado é: " + resultado );
		         break;
		         
		case(5): break;
		
		default: System.out.println("A opção escolhida não é valida!");
		}
		
		return resultado;
	}

}
