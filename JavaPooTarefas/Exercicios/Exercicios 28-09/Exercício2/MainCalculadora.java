package exercicioaula3;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double a, b;
		Integer c;
		Calculadora calculadora = new Calculadora();
		
		do{
			
		System.out.println("Insira o primeiro n�mero: ");
		a = ler.nextDouble();
		
		System.out.println("Insira o segundo n�mero: ");
		b = ler.nextDouble();
		
		System.out.println("Qual ser� a opera��o? \n 1 � soma\n 2 � subtra��o\n 3 � multiplica��o\n 4 � divis�o\n  5 � sair ");
		c = ler.nextInt();
		
		calculadora.Calculando(a, b, c);
						
												
		}while(c!=5);	
		
		ler.close();
	}

}
