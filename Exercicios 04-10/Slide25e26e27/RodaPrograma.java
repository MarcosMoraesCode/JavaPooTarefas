package ExerciciosAula8;

public class RodaPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[]vetor = {1,2,3,4,5};
		Integer[]vetor2 = {3,0,2};
		Integer i;
		
		//Exercicio 2 seria resolvido com o try e os catchs de aritm�tica e indice de vetor
			for (i = 0; i < vetor.length; i++) 
				
				try {
				//Pro exerc�cio 1, somente o for e a linha abaixo seriam a solu��o, e acusaria erro ao encontrar 0 no vetor2.	
				System.out.println("Dividindo:" + vetor[i] + "/" + vetor2[i] + " = "  + (vetor[i]/vetor2[i]) );
				
				} catch(ArithmeticException erro) {
					
				System.out.println("Erro de divis�o por zero");
				
				} catch(ArrayIndexOutOfBoundsException erro) {
				
					System.out.println("Erro de posi��o do vetor inexistente");
					
				}
			
	}
}

