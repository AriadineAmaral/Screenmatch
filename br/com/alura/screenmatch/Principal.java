package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class Principal {

	public static void main(String[] args) {
	
		
		Titulo meuFilme = new Filme();
		
		meuFilme.setNome("O Poderoso Chefão");
		meuFilme.setAnoLancamento(1978); 
		meuFilme.setDuracaoEmMin(180);
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(10);
		meuFilme.avalia(5);
		meuFilme.avalia(7);
		
		
		
		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Media de avaliações: " + meuFilme.pegaMedia());

		
		Serie lost = new Serie();
		
		lost.setNome("Lost");
		lost.setAnoLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpPorTemporada(12);
		lost.setMinutoPorTemporada(50);
		
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(lost);
		
		System.out.println("Tempo total: " + calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Episodio episodio = new Episodio();
		
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
	}

}
