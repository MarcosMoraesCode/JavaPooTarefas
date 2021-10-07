package ExerciciosAula9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {

	// DESABAFO: Demorei 43098 anos pra entender o que estava dando problema (NÃO INSIRA A NOTA COM "." USE VIRGULA!
	//CONTINUA DESABAFO: Ele usa a leitura de dados Local, e no Brasil, usamos "R$ 10,00" e não "R$ 10.00"
	//MEU PROGRAMA RODA SIM! KKKKK
	
	private List<Aluno> alunos;
	private Double alteranota1 = 0.;
	private Double alteranota2 = 0.;
	
	
	
	public  void cadastraAluno(Aluno aluno, Scanner ler, Integer contador) {
		
								
		System.out.println("Insira a primeira nota do(a) aluno(a) " + aluno.getNome() + " : ");
		alteranota1 = ler.nextDouble();			
		aluno.setNota1(alteranota1);
		
		System.out.println("Insira a segunda nota do(a) aluno(a) "+ aluno.getNome() + " : ");
		alteranota2 = ler.nextDouble();
		aluno.setNota2(alteranota2);
		
		do {
			try {
				
					aluno.mediaNota();
					System.out.println("A média de " + aluno.getNome() + " é: " + aluno.mediaNota());
					contador+=1;
				
			}catch(NumeroInvalidoException erro) {
				
				System.out.println(erro.getMessage()); 
				//Tratar possíveis erros de exceção de notas inválidas

				
				System.out.println("Insira novamente a primeira nota do aluno:");
				alteranota1 = ler.nextDouble();			
				aluno.setNota1(alteranota1);
				
				System.out.println("Insira novamente a segunda nota do aluno:");
				alteranota2 = ler.nextDouble();
				aluno.setNota2(alteranota2);
							
				
			}		
			
		}while(alteranota1>10.0 || alteranota1<0.0 || alteranota2>10.0 || alteranota2<0.0 || contador == 0);

		
		
	}
	
	public void adicionaAlunoNaTurma(Aluno alunos) {
		this.alunos.add(alunos);
	}
	
	public void mostraTurma() {
		System.out.println("Alunos da turma: \n "+ this.alunos);
		
	}
	

	public Turma() {
		super();
		this.alunos = new ArrayList<Aluno>();
				
	}
	
	

}
/*
 * 	
		Double alteranota1 = 0.;
		Double alteranota2 = 0.;
		String recebeNome;
		Integer contador = 0;
		Scanner ler = new Scanner(System.in);
						
		System.out.println("Insira o nome do aluno:");
		recebeNome = ler.next();
		aluno1.setNome(recebeNome);
		
		System.out.println("Insira a primeira nota do aluno:");
		alteranota1 = ler.nextDouble();			
		aluno1.setNota1(alteranota1);
		
		System.out.println("Insira a segunda nota do aluno:");
		alteranota2 = ler.nextDouble();
		aluno1.setNota2(alteranota2);
		
					
	do {
		try {
			
				aluno1.mediaNota();
				System.out.println("A média de " + aluno1.getNome() + " é: " + aluno1.mediaNota());
				contador+=1;
			
		}catch(NumeroInvalidoException erro) {
			
			System.out.println(erro.getMessage()); 
			//Tratar possíveis erros de exceção de notas inválidas

			
			System.out.println("Insira novamente a primeira nota do aluno:");
			alteranota1 = ler.nextDouble();			
			aluno1.setNota1(alteranota1);
			
			System.out.println("Insira novamente a segunda nota do aluno:");
			alteranota2 = ler.nextDouble();
			aluno1.setNota2(alteranota2);
						
			
		}		
		
	}while(alteranota1>10.0 || alteranota1<0.0 || alteranota2>10.0 || alteranota2<0.0 || contador == 0);

	ler.close();
	
}*/
