package ExerciciosAula9;

import java.util.Scanner;
//Criar uma classe de teste com o main e instanciar um objeto do tipo aluno passando o nome e as notas no
//construtor de aluno
public class TestaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//
		
		
		Aluno aluno1 = new Aluno("Marcos", 0.,0.);
		Aluno aluno2 = new Aluno("Jessica", 0.,0.);
		Aluno aluno3 = new Aluno("Juliana", 0.,0.);
		Turma turma1 = new Turma();
		Integer contador1 = 0;
		Integer contador2 = 0;
		Integer contador3 = 0;
		
		
			
		
		Scanner ler = new Scanner(System.in);
		turma1.cadastraAluno(aluno1,ler,contador1);
		turma1.adicionaAlunoNaTurma(aluno1);
		Scanner ler2 = new Scanner(System.in);
		turma1.cadastraAluno(aluno2,ler2,contador2);
		turma1.adicionaAlunoNaTurma(aluno2);
		Scanner ler3 = new Scanner(System.in);
		turma1.cadastraAluno(aluno3,ler3,contador3);
		turma1.adicionaAlunoNaTurma(aluno3);
		
		turma1.mostraTurma();
		
		
		
	}

}

		

