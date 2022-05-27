package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Elefante implements Individuo{

	private String nomeAnimal;
	
	public Elefante() {
		
	}
	
	
	public Elefante(String nomeAnimal) {
		super();
		this.nomeAnimal = nomeAnimal;
	}


	public String getNomeAnimal() {
		return nomeAnimal;
	}


	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}


	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeAnimal+ " come frutas e plantas e n�o "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("Eu ando, corro mas gosto mesmo � de VOAR");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("Estou voandoooo!!");
		
	}

	
}
