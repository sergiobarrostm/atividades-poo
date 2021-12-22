package br.ufal.carro;

public class Tanque {

	private int capacidade;
	private int quantidadePresente;

	public Tanque(int capacidade) {
		this.capacidade = capacidade;
		this.quantidadePresente = 0;
	}

	public void abastecer(int quantidade) {
		if (this.quantidadePresente + quantidade >= this.capacidade) {
			this.quantidadePresente = this.capacidade;
		} else {
			this.quantidadePresente += quantidade;
		}
	}

	public int usarCombustivel(int quantidade) {
		int quantidadeRetirada = 0;
		
		if (this.quantidadePresente >= quantidade) {
			quantidadeRetirada = quantidade;
			this.quantidadePresente -= quantidade;
		} else {
			quantidadeRetirada = - this.quantidadePresente;
			this.quantidadePresente = 0;
		}
		return quantidadeRetirada;
	}

}