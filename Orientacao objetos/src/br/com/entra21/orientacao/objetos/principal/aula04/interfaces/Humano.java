package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

//implements trouxe os metods que eu n�o tinha  (alimentar, locomover, comunicar) puxou de individuo
public class Humano extends Pessoa implements Individuo{

	public Humano() {
		
	}
	
	public void ApresentarSe() {
		System.out.println("Oi meu nome � "+getNome());
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(getNome()+" eu posso comer de quase tudo, inclusive "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(getNome()+ " eu posso andar e correr");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(getNome()+" sou especial pois sou o unico que consegue falar");
		System.out.println(conteudo);
	}
}
