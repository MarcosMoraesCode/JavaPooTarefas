package ExerciciosAula8;

import java.util.Scanner;

public class LerInteiro {
	
	/*
	Fa�a um programa que leia um n�mero inteiro. Caso o usu�rio
	digite outro tipo de n�mero ou caractere ocorra o tratamento
	da exce��o e apresente a mensagem �Falha ao ler o n�mero�. E
	em caso de sucesso, apresente o n�mero digitado.*/
	
	public static void main(String[] args) {
		
		System.out.println("Insira um n�mero INTEIRO: ");
		
		try {
			Integer numeroInserido = lerInteiro();
			System.out.println("Voc� inseriu o inteiro: " + numeroInserido);
		}
		catch (Exception erro) {
			System.out.println("N�o � um inteiro");
		}
	
			
		}
	
	public static Integer lerInteiro() throws Exception {
		
	Scanner ler = new Scanner(System.in);
	Integer num = ler.nextInt();
	ler.close();
	return num;
	
	}
}