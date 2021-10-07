package ExerciciosAula9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TesteDatas {

	/*
	 * 1. Após isso apresente a sua data de nascimento e dia de hoje no formato “dd/mm/yyyy”.
	   2. Apresente se o seu ano de nascimento foi um ano bissexto.
	   3. Apresente também quantos segundo se passaram desde seu nascimento.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Após isso apresente a sua data de nascimento e dia de hoje no formato “dd/mm/yyyy”.
		
		LocalDateTime nascimento = LocalDateTime.of(1995, 10, 19, 00, 00);
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		System.out.println("O nascimento foi em: " + nascimento.format(formatado));
		
		// 2. Apresente se o seu ano de nascimento foi um ano bissexto.
		
		System.out.println("O ano foi bissexto? " + nascimento.toLocalDate().isLeapYear());
		
		// 3. Apresente também quantos segundo se passaram desde seu nascimento.
		
		LocalDateTime agora = LocalDateTime.now();
		Duration duracao = Duration.between( nascimento, agora);
		
		System.out.println("Segundos de vida: " + duracao.getSeconds());

	}

}
