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

		
		/*Se o peso do atleta for maior que 90 a sua modalidade ser� �peso pesado� retornando a String �participar�
		Se o peso do atleta for entre 60 e 90 a sua modalidade ser� �peso m�dio� String �participar�
		Caso contr�rio o atleta n�o participar�*/
		
		public String verificarSituacao() {
			
			String resposta;
			if(this.peso>90 ) {
				
				this.modalidade = "Peso Pesado";
				resposta = "Participar�. Categoria: ";
				
			}else if(this.peso>60) {
				
				this.modalidade = "Peso M�dio";
				resposta = "Participar�. Categoria: ";
			}else {
				
				resposta = "N�o participar�. ";
			}
			
			return String.format("O atleta %s", resposta, " na categoria ");
		}
		
		
		
		
		
		
		

	}


