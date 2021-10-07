package ExerciciosAula9;

import java.util.HashMap;
import java.util.Map;

public class TestaVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> carros = new HashMap<String, String>();
		carros.put(" FIAT "," UNO ");
		carros.put(" General Motors "," Celta ");
		carros.put(" Wolkswagem "," Voyage ");
		carros.put(" Hyundai ", " HB20 ");
		
		for(String a: carros.keySet()) {
			
			System.out.println(a);
		}
		
		for(Map.Entry<String, String> pao: carros.entrySet()) {
			
			System.out.println(pao);
			
		}
		
	}

}
