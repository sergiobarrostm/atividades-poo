package br.ufal.carro;

public abstract class Motor {

	private boolean ligado;
	private int aceleracao;

	public Motor() {
		this.ligado = true;
		this.aceleracao = 0;
	}

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
	}

	public boolean isLigado() {
		return false;
	}
	

	public int getAceleracao() {
		return aceleracao;
	}

	protected void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public abstract void acelerar(Carro c, int quantCombustivel);

}
