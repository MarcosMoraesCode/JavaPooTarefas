package ExerciciosAula9;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario1 = new Funcionario("Leonardo", "Programador", 12.00);
		Funcionario funcionario2 = new Funcionario("Marcos", "Engenheiro", 5600.00);		
				
		Funcionario[] vetorfuncionario1 = new Funcionario[] {funcionario1, funcionario2};
		
				
		
		System.out.println(vetorfuncionario1[0]);
		
		System.out.println(vetorfuncionario1[1]);
		
		
		

	}

}
