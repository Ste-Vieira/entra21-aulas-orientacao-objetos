package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.classes.Aluno;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Aluno alunoTeste = new Aluno();

		Aluno outroAluno = new Aluno();

		Aluno alunoNovato = new Aluno();

		alunoTeste.nome = "Stephanie";
		alunoTeste.idade = 28;

		outroAluno.nome = "Henrique";
		outroAluno.idade = 5;
		
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();


		/*
		 * System.out.println("Qual o nome do aluno novato?"); alunoNovato.nome =
		 * input.next();
		 * 
		 * System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		 * alunoNovato.idade = input.nextByte();
		 * 
		 * System.out.println("Bem vindo " + alunoNovato.nome);
		 */
	}

}
