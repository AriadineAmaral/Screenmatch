package modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
	
	//Extends para herdar a classe e implements para herdar a interface

	
	//extends determina que filme é um título
	
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		
		return (int)pegaMedia()/2;
	}
	
	

	
	
}
