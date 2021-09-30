package ExerciciosAula4;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente gerente = new Gerente("Moisés",1500.0);
		Assistente assistente = new Assistente("Leo", 8400.0, 560.0);
		Funcionario funcionario1 = new Funcionario("Pleu", 88.9);
		
		funcionario1.AdicionarBonus();
		gerente.AdicionarBonus();
		assistente.AdicionarBonus();
		
		System.out.println(" Nome: " + funcionario1.nome + " Salario: " + funcionario1.salario);
		System.out.println(" Nome: " + gerente.nome + " Salario: " +  gerente.salario);
		System.out.println(" Nome: " + assistente.nome + " Salario: " + assistente.salario);
		
						
		/* NAO ENTENDI PQ NÃO RODA ISSO
		public void calculaBonus(Funcionario funcionario){
			funcionario.AdicionarBonus();
			System.out.println(funcionario);
			}*/
	}

}
