package modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Serie extends Titulo implements Classificavel {
	

	private int temporadas;
	private boolean ativa;
	private int epPorTemporada;
	private int minutoPorTemporada;
	private int totalVisualizacoes;
	
	
	public int getTotalVisualizacoes() {
		return totalVisualizacoes;
	}
	public void setTotalVisualizacoes(int totalVisualizacoes) {
		this.totalVisualizacoes = totalVisualizacoes;
	}
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getEpPorTemporada() {
		return epPorTemporada;
	}
	public void setEpPorTemporada(int epPorTemporada) {
		this.epPorTemporada = epPorTemporada;
	}
	public int getMinutoPorTemporada() {
		return minutoPorTemporada;
	}
	public void setMinutoPorTemporada(int minutoPorTemporada) {
		this.minutoPorTemporada = minutoPorTemporada;
	}
	
	
	
	
	public int getDuracaoEmMin() {
		
		return temporadas * epPorTemporada * minutoPorTemporada;
	}
	@Override
	public int getClassificacao() {
		if (totalVisualizacoes > 100) {
			return 4;
		}else {
			return 2;
		}
		
	}
	
	
}
