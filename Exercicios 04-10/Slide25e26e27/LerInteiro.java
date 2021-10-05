package ExerciciosAula8;

import java.util.Scanner;

public class LerInteiro {
	
	/*
	Faça um programa que leia um número inteiro. Caso o usuário
	digite outro tipo de número ou caractere ocorra o tratamento
	da exceção e apresente a mensagem ”Falha ao ler o número”. E
	em caso de sucesso, apresente o número digitado.*/
	
	public static void main(String[] args) {
		
		System.out.println("Insira um número INTEIRO: ");
		
		try {
			Integer numeroInserido = lerInteiro();
			System.out.println("Você inseriu o inteiro: " + numeroInserido);
		}
		catch (Exception erro) {
			System.out.println("Não é um inteiro");
		}
	
			
		}
	
	public static Integer lerInteiro() throws Exception {
		
	Scanner ler = new Scanner(System.in);
	Integer num = ler.nextInt();
	ler.close();
	return num;
	
	}
}