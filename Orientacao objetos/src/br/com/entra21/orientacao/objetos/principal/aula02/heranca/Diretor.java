package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa {

	// removi os atributos comuns nome, idade e cpf
	private String cursoAtual;
	private byte quantidadeProfessores;

	public Diretor() {
		super();
	}

	public Diretor(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public Diretor(String nome, byte idade, String cursoAtual, byte quantidadeProfessores) {
		super(nome, quantidadeProfessores, cursoAtual);

		this.cursoAtual = cursoAtual;
		this.quantidadeProfessores = quantidadeProfessores;
	}

	public void realizarAprentacao() {
		System.out.println("Oi meu nome é " + super.getNome() + " e tenho " + super.getIdade() + " anos.");
	}

	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQuantidadeProfessores() {
		return quantidadeProfessores;
	}

	public void setQuantidadeProfessores(byte quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}

}
