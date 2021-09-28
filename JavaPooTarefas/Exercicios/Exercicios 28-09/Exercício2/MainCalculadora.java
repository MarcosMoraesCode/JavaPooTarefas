package exercicioaula3;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double a, b;
		Integer c;
		Calculadora calculadora = new Calculadora();
		
		do{
			
		System.out.println("Insira o primeiro número: ");
		a = ler.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		b = ler.nextDouble();
		
		System.out.println("Qual será a operação? \n 1 – soma\n 2 – subtração\n 3 – multiplicação\n 4 – divisão\n  5 – sair ");
		c = ler.nextInt();
		
		calculadora.Calculando(a, b, c);
						
												
		}while(c!=5);	
		
		ler.close();
	}

}
