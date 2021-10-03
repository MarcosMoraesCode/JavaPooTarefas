package ExercicioSlide7;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Proprietario proprietario1 = new Proprietario("Jaozim");
		Carro carro1 = new Carro("SUV", "Sedan", LocalDate.of(2021, 9, 6), proprietario1);
		
		System.out.println(String.format(proprietario1.toString() + carro1.toString()));
		carro1.lavarVeiculo();
		System.out.println("O valor cobrado até agora é de: " + carro1.getValorCobrado());
		carro1.revisao();
		System.out.println("O valor cobrado até agora é de: " + carro1.getValorCobrado());
		
		
	}

}
