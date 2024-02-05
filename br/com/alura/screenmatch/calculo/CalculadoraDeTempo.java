package br.com.alura.screenmatch.calculo;
import modelos.Filme;
import modelos.Titulo;

public class CalculadoraDeTempo {

	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}

	
	public void inclui(Titulo titulo) {
		this.tempoTotal += titulo.getDuracaoEmMin();
		
	}
	
	
}
