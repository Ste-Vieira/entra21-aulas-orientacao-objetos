package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {

	private String nome;
	private byte idade;
	private int qtdVitorias;
	private int qtdDerrotas;

	public Atleta() {
		super();
	}

	public Atleta(String nome, byte idade, int qtdVitorias, int qtdDerrotas) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.qtdVitorias = qtdVitorias;
		this.qtdDerrotas = qtdDerrotas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public int getQtdVitorias() {
		return qtdVitorias;
	}

	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}

	public int getQtdDerrotas() {
		return qtdDerrotas;
	}

	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}

	public void comemorarVitoria() {
		System.out.println("Obrigada!!");
		this.qtdVitorias++;
	}

	public void aprenderComDerrota() {
		System.out.println("O importante é competir :(");
		this.qtdDerrotas++;
	}

}
