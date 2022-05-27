package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo{

	//quando eu n�o escrevo o meu construtor vazio � pq ele j� tem por padr�o
	// porem quando eu crio um construtor customizado eu perco meu construtor
	//padr�o e sou obrigada a criar um manualmente
	@Override
	public void alimentar(String alimento) {
		System.out.println("A capivara come mato e "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, corre e nada");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("...");
		
	}

	
	
}
