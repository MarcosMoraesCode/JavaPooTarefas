package ExerciciosAula6;

public class TestaAtleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("Argentina");
		
		Atleta atleta1 = new Atleta("Moisés", 110.0,  pais1);
		Atleta atleta2 = new Atleta("Maria", 65.0,  pais2);
		Atleta atleta3 = new Atleta("Mané", 59.0,  pais2);
		
		System.out.println(atleta1.toString());
		System.out.println(atleta1.verificarSituacao() + atleta1.getModalidade());
		System.out.println(atleta2.toString());
		System.out.println(atleta2.verificarSituacao() + atleta2.getModalidade());
		System.out.println(atleta3.toString());
		System.out.println(atleta3.verificarSituacao() + atleta3.getModalidade());
		
		
		
	}

}
