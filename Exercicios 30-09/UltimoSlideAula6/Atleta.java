package ExerciciosAula6;

	public class Atleta implements Olimpiadas {
		
		private String nome;
		private Double peso;
		private String modalidade;
		private static Integer totalParticipantes =0;
		private Pais pais;
		
		public Atleta(String nome, Double peso, Pais pais) {
			super();
			this.nome = nome;
			this.peso = peso;
			this.pais = pais;
			totalParticipantes +=1;
			
			
		}

		public String getNome() {
			return nome;
		}

		public Double getPeso() {
			return peso;
		}

		public String getModalidade() {
			return modalidade;
		}

		public static Integer getTotalParticipantes() {
			return totalParticipantes;
		}

		public Pais getPais() {
			return pais;
		}
		
		public String toString() {
			
			return ("Nome: " + this.nome + "| Pais: " + pais.getNome() + "| Peso: " + this.peso);
		}

		
		/*Se o peso do atleta for maior que 90 a sua modalidade será “peso pesado” retornando a String “participará”
		Se o peso do atleta for entre 60 e 90 a sua modalidade será “peso médio” String “participará”
		Caso contrário o atleta não participará*/
		
		public String verificarSituacao() {
			
			String resposta;
			if(this.peso>90 ) {
				
				this.modalidade = "Peso Pesado";
				resposta = "Participará. Categoria: ";
				
			}else if(this.peso>60) {
				
				this.modalidade = "Peso Médio";
				resposta = "Participará. Categoria: ";
			}else {
				
				resposta = "Não participará. ";
			}
			
			return String.format("O atleta %s", resposta, " na categoria ");
		}
		
		
		
		
		
		
		

	}


