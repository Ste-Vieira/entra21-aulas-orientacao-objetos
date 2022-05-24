package br.com.entra21.orientacao.objetos.principal.aula01.classes;

import java.util.Scanner;

public class Aluno {

	//definir atributos de um aluno e cada objeto aluno tera variaveis, chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas;
	//public pode ser acessado por outra classe
	
	// na declaração (public Aluno()) só tem o acesso (public) e tipo de retorno (Aluno)
	public Aluno() { //construtor vazio que ao utilizar o (new Aluno) ele é executado
		
	}
	public Aluno(String nomeLaDeFora) {
		this.nome = nomeLaDeFora;
	}
	public byte responderChamada() {
		Scanner input = new Scanner(System.in);
		System.out.println("O aluno "+this.nome+" está ai?"); 
		String resposta = input.next();
		if(resposta.equalsIgnoreCase("sim")) {
			this.quantidadePresencas++;
			//this serve para reafirmar que estamos mencionando um atributo so meu objeto
		}
		return this.quantidadePresencas;
	}
}
