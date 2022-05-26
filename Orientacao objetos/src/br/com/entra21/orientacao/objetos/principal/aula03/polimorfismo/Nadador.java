package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Nadador extends Atleta{

	private String ambienteAquatico;
	private String equipamentoAquatico;

	public Nadador() {
		
	}

	public Nadador(String ambienteAquatico, String equipamentoAquatico) {
		super();
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
	}
	
	

	public Nadador(String nome, byte idade, int qtdVitorias, int qtdDerrotas, String ambiemteAquatico, String equipamentoAquatico) {
		super(nome, idade, qtdVitorias, qtdDerrotas);
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
	}

	public String getAmbienteAquatico() {
		return ambienteAquatico;
	}

	public void setAmbienteAquatico(String ambienteAquatico) {
		this.ambienteAquatico = ambienteAquatico;
	}

	public String getEquipamentoAquatico() {
		return equipamentoAquatico;
	}

	public void setEquipamentoAquatico(String equipamentoAquatico) {
		this.equipamentoAquatico = equipamentoAquatico;
	}
	
	//comemor vitoria já existe na super classe
	//mas se eu criar com o mesmo nome visibilidade, tipo de retorno e argumentos
	//o método escolhido sera esse aqui, mas não o da super classe
	public void comemorarVitoria(String frase) {
		setQtdVitorias(getQtdVitorias()+1);
		
		System.out.println(getNome()+(frase.isEmpty()?" Comemora batendo na água":frase));
		
	}
}
