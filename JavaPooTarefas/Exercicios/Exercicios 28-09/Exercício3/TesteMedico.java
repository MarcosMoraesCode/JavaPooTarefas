package exercicioaula3;

public class TesteMedico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medico medico1 = new Medico(12345,"Ana Maria" , 0.0, 250.0);
		Medico medico2 = new Medico(456789, "Antônio", 0.0, 300.0);
		
		/*Fazer uma consulta com pagamento em dinheiro*/
		
		medico1.pagamentoDim();
		medico2.pagamentoDim();
		
		/*Fazer uma consulta com pagamento pelo plano*/
		
		medico1.pagamentoPlano();
		medico2.pagamentoPlano();
		
		/*Exiba na tela os dados dos médicos.*/
		
		System.out.println(String.format("\n CRM: " + medico1.crm + "\n Nome: " + medico1.nome + "\n Salario: "
				+ medico1.salario + "\n Valor da Consulta: " + medico1.valorConsulta ));
		
		System.out.println(String.format("\n CRM: " + medico2.crm + "\n Nome: " + medico2.nome + "\n Salario: "
				+ medico2.salario + "\n Valor da Consulta: " + medico2.valorConsulta ));
		
		/*Exiba o número total de médicos.*/
		
		System.out.println("A quantidade de médicos cadastrados é: " + Medico.numMedicos);
		
	}

}
