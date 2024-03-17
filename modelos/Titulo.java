package modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Titulo implements Classificavel {

	
	
		private String nome;
		private int anoLancamento;
		private boolean incluidoNoPlano;
		private double somaAvaliacao;
		private int totalDeAvaliacoes;
		private int duracaoEmMin;
		


		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getAnoLancamento() {
			return anoLancamento;
		}

		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}

		public boolean isIncluidoNoPlano() {
			return incluidoNoPlano;
		}

		public void setIncluidoNoPlano(boolean incluidoNoPlano) {
			this.incluidoNoPlano = incluidoNoPlano;
		}

		public int getDuracaoEmMin() {
			return duracaoEmMin;
		}

		public void setDuracaoEmMin(int duracaoEmMin) {
			this.duracaoEmMin = duracaoEmMin;
		}

		public int getTotalDeAvaliacoes() {
			return totalDeAvaliacoes;
		}

		public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
			this.totalDeAvaliacoes = totalDeAvaliacoes;
		}
		
		public double getSomaAvaliacao() {
			return this.somaAvaliacao;
		}

		public void setSomaAvaliacao(double somaAvaliacao) {
			this.somaAvaliacao = somaAvaliacao;
		}
		
		

		public void exibeFichaTecnica() {
			
			System.out.println("Nome do filme: " + nome);
			System.out.println("Ano de lançamento: " + anoLancamento);
			System.out.println("Avaliação: " + somaAvaliacao);
			System.out.println("Total de avaliações: " + totalDeAvaliacoes);
			System.out.println("Duração: " + duracaoEmMin + " min");
		}
		
		public void avalia(double nota) {
			somaAvaliacao += nota;
			totalDeAvaliacoes++;
			
		}
		
		public double pegaMedia(){
			return somaAvaliacao/totalDeAvaliacoes;
		}

		@Override
		public int getClassificacao() {
			
			return 0;
		}
}
