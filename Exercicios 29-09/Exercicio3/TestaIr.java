package ExerciciosAula4;

public class TestaIr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pessoa1 = new PessoaFisica("Marcos", 6000.0, "2154548181", "187171771");
		PessoaJuridica pessoa2 = new PessoaJuridica("Casas Bahia", 10000.0, "2154541", "LALALA187171771");
		
		System.out.println(String.format(" Nome: "+ pessoa1.nome + " Rendimento: " + pessoa1.rendimentos +
				" Imposto de Renda a pagar: "+ pessoa1.calculoIR()));
		
		System.out.println(String.format(" Nome: "+ pessoa2.nome + " Rendimento: " + pessoa2.rendimentos +
				" Imposto de Renda a pagar: "+ pessoa2.calculoIR()));
		
	

	}

}
