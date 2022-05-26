package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Velocista extends Atleta{

	private String tipoPista;
	private String marcaCalcado;
	
	public Velocista() {
		super();
	}

	public Velocista(String tipoPista, String marcaCalcado) {
		super();
		this.tipoPista = tipoPista;
		this.marcaCalcado = marcaCalcado;
	}
	
	
	

	public Velocista(String nome, byte idade, int qtdVitorias, int qtdDerrotas) {
		super(nome, idade, qtdVitorias, qtdDerrotas);
	}

	public String getTipoPista() {
		return tipoPista;
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getMarcaCalcado() {
		return marcaCalcado;
	}

	public void setMarcaCalcado(String marcaCalcado) {
		this.marcaCalcado = marcaCalcado;
	}

	@Override
	public void comemorarVitoria() {
		super.comemorarVitoria();
		
		System.out.println(super.getNome()+"Estou cansado, mas feliz");
		
	
	}
	
	
}
