package ExerciciosAula4;

/*Crie duas inst�ncias da classe Empregado
Calcule o imposto de renda
Exibe os dados do usu�rio com o sal�rio j� descontado o imposto de renda
*/

public class AppTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado empregado1 = new Empregado("Marcos", "Moraes", 5680.0);
		Empregado empregado2 = new Empregado("Jessica", "Pereira", 2790.0);
		
		empregado1.CalculaImpostoRenda(empregado1.getSalario());
		empregado2.CalculaImpostoRenda(empregado2.getSalario());
		
		System.out.println(String.format("O sal�rio l�quido de %s %s �: %.2f", empregado1.getNome(), empregado1.getSobrenome(),
				empregado1.CalculaImpostoRenda(empregado1.getSalario())));
		
		System.out.println(String.format("O sal�rio l�quido de %s %s �: %.2f", empregado2.getNome(), empregado2.getSobrenome(),
				empregado2.CalculaImpostoRenda(empregado2.getSalario())));
		
		}
	
}
