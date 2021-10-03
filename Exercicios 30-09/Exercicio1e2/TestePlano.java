package ExerciciosAula5;

public class TestePlano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clinica clinica = new Clinica(" Unimed ", " Odontológica ", " 3873a87na ");
		Medico medico = new Medico(" Unimed ", " Sergio ", 744);
		Anestesista anestesista = new Anestesista(" Unimed ", " Claudia ", 8484 , " Experiente ");
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		cp.calcularTotalPago(clinica);
		System.out.println(clinica.toString());
		System.out.println(cp.toString());
		
		medico.calcularPagamento();
		cp.calcularTotalPago(medico);
		System.out.println(medico.toString() + "| Valor pago pelo plano: " + medico.getValorPago());
		System.out.println(cp.toString());
		
		anestesista.calcularPagamento();
		cp.calcularTotalPago(anestesista);
		System.out.println(anestesista.toString() + "| Valor pago pelo plano: " + anestesista.getValorPago());
		System.out.println(cp.toString());
		
		
		
		
		
	}

}
