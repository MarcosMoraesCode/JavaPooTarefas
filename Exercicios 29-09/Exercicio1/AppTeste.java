package ExerciciosAula4;

/*Crie duas instâncias da classe Empregado
Calcule o imposto de renda
Exibe os dados do usuário com o salário já descontado o imposto de renda
*/

public class AppTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado empregado1 = new Empregado("Marcos", "Moraes", 5680.0);
		Empregado empregado2 = new Empregado("Jessica", "Pereira", 2790.0);
		
		empregado1.CalculaImpostoRenda(empregado1.getSalario());
		empregado2.CalculaImpostoRenda(empregado2.getSalario());
		
		System.out.println(String.format("O salário líquido de %s %s é: %.2f", empregado1.getNome(), empregado1.getSobrenome(),
				empregado1.CalculaImpostoRenda(empregado1.getSalario())));
		
		System.out.println(String.format("O salário líquido de %s %s é: %.2f", empregado2.getNome(), empregado2.getSobrenome(),
				empregado2.CalculaImpostoRenda(empregado2.getSalario())));
		
		}
	
}
