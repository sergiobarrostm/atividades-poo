package br.ufal.aracomp.transacoesBancarias;

public class ContaCorrente extends Conta{

	private float limiteEspecial;
	
	public ContaCorrente(int numero, float saldo, String senha, float limiteEspecial) {
		super(numero, saldo, senha);
		this.limiteEspecial = limiteEspecial;
	}

	public float getLimiteEspecial() {
		return limiteEspecial;
	}
	
	public void setLimiteEspecial(float limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public void sacar(String senha, float valor) throws Exception {
		if (validarSenha(senha) && saldo >= valor ) {
			this.saldo -= valor;
		}else if (validarSenha(senha) == false ) {
			throw new Exception("ErroPermissaoException");
		}
		else if (valor > saldo && valor > (saldo + limiteEspecial)) {
			throw new Exception("ErroSaldoException");
		}
		else if (valor <= 0 ) {
			throw new Exception("ErroValorException");
		}
	}
}
