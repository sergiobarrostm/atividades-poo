package br.ufal.aracomp.transacoesBancarias;

public class Poupanca extends Conta{

	private float indiceRendimento;
	
	public Poupanca(int numero, float saldo, String senha, float indiceRendimento) {
		super(numero, saldo, senha);
		this.indiceRendimento = indiceRendimento;
	}

	public float getIndiceRendimento() {
		return indiceRendimento;
	}
	
	public void render() throws Exception {
		float rendimento = this.getSaldo(senha) * indiceRendimento;
		this.depositar(rendimento);
	}
}
