package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Velocista;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Escolha uma opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender classes");
			System.out.println("2 - Aprender herança");
			System.out.println("3 - Polimorfismo");

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
			case 3:
				aprenderPolimorfismo();
				break;
			default:
				System.out.println("Escolha uma opção válida");
				break;
			}
		} while (opcao != 0);

	}

	public static void aprenderClassesObjetos() {

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
	
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte)28);
		funcionario1.setNome("Stephanie");
		funcionario1.setCargoAtual("Desenvolvedor");
		funcionario1.setSalario(4522.78f);
		System.out.println("Oi meu nome é "+funcionario1.getNome()+" e tenho "+funcionario1.getIdade()+ " anos.");

		
		Funcionario funcionario2 = new Funcionario("Stephanie", (byte)28, "09879766", "Desenvolvedor Jr.", 5653.89f);
				
		
		
		Diretor diretor1 = new Diretor();
		diretor1.realizarAprentacao();
		Diretor diretor2 = new Diretor();
		diretor2.realizarAprentacao();
		/*
		 * Diretor diretor3 = new Diretor("Paulo", (byte) 35);
		 * diretor3.realizarAprentacao();
		 */
	}
	
	private static void aprenderPolimorfismo() {
		
		//padrão do polimorfismo para comportamentos(métodos) é herdar 
		//segunda forma: é fazer completamente os comportamentos(metodos) do meu jeito o que eu herdei.
		//terceira forma: é aproveitar a minha herança e fazer um diferencial
		Atleta cr7 = new Atleta();
		cr7.comemorarVitoria();
		cr7.aprenderComDerrota();
		cr7.setNome("Cristiano");
		cr7.comemorarVitoria();
		
		Nadador jobson = new Nadador("Jobson", (byte)35, 53, 81, "Mar", "Sunga");
		jobson.comemorarVitoria("");
		jobson.aprenderComDerrota();
		jobson.setNome("Jobson Segundo");
		
		Velocista flash = new Velocista();
		flash.setMarcaCalcado("Adidas");
		flash.setNome("Barry Alan");
		flash.comemorarVitoria();
		flash.aprenderComDerrota();
	}
}
