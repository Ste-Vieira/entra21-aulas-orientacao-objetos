package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Escolha uma opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender classes");
			System.out.println("2 - Aprender herança");

			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprenderHeranca();
				break;
			default:
				System.out.println("Escolha uma opção válida");
				break;
			}
		} while (opcao != 0);

	}

	public static void aprenderClassesObjetos() {
		
		Diretor diretor1 = new Diretor();
		diretor1.realizarAprentacao();
		Diretor diretor2 = new Diretor ();
		diretor2.realizarAprentacao();
		Diretor diretor3 = new Diretor("Paulo",(byte)35);
		diretor3.realizarAprentacao();
		
		
		Professor professorJava = new Professor();
		professorJava.setNome("Oliota");
		Professor professoraIngles = new Professor("Isabelle", (byte) 33);

		Aluno alunoTeste = new Aluno();
		alunoTeste.nome = "Stephanie";
		Aluno outroAluno = new Aluno("Fulano");
		outroAluno = null;
		outroAluno = new Aluno("Exemplo");
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

	public static void aprenderHeranca() {
		
		
		
	}
}
