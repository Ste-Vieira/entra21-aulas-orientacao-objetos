package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {

	// atributos devem ser private e se possivel criar gets e sets para quem realmente precisa
	private String nome;
	private byte idade;
	private byte quantidadeAlunos;

	public Professor() {
		// construtor vazio, não inicializa os atributos
	}

	public Professor(String nome, byte idade) {
		this.nome = nome;
		this.idade=idade;
		// construtor com parametros pode inicializar alguns ou todos os atributos

	}
	
	public String getNome() {
		//ler o valor la fora
		return this.nome;
	}
	public void setNome(String nome) {
		//recebr um valor novo la de fora
	//	this.nome=nome;
	}
	
	public byte getIdade() {
		return this.idade;
	}
	
}
