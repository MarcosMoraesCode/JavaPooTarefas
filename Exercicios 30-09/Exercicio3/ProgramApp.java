package ExerciciosAula5;

public class ProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade1 = new Cidade("Nova Friburgo", estado1);
		Endereco endereco1 = new Endereco("Mackniven", "Ypu", "63200142", cidade1);
		Contato contato1 = new Contato("Marcos Moraes", endereco1);
		Telefone telefone1 = new Telefone("(22) 2325 - 2626");
		Telefone telefone2 = new Telefone("(22) 2325 - 2727");
		Telefone telefone3 = new Telefone("(22) 2325 - 2828");
		
		contato1.addTelefones(telefone1);
		contato1.addTelefones(telefone2);
		contato1.addTelefones(telefone3);
		
		System.out.println(String.format(contato1.toString() + contato1.getEndereco().toString()));
		contato1.mostrarTelefones();
		
		
	}

}
