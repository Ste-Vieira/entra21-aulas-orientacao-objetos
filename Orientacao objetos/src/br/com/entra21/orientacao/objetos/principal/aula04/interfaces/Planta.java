package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo{

	private String nomeCientifico;
	
	public Planta (){
		
	}

	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeCientifico+" eu não preciso de "+alimento+ " pois faço fotossintese");
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeCientifico+" Não preciso me mexer, consigo sem sair daqui");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCientifico+"Planta não fala por que ainda é MUDA!!");
		
	}
	
	
}
