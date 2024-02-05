package modelos;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.Classificavel;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;


public class Episodio implements Classificavel{

	private int totalVisualizacoes;
	private int numero;
	private String nome;
	private Serie serie;
	
	
	//Getters e Setters 
	
	public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
	

	public void setTotalVisualizacoes(int totalVisualizacoes) {
		this.totalVisualizacoes = totalVisualizacoes;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	
}
