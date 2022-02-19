package br.ufal.aracomp.transacoesBancarias;

public abstract class Conta {
	protected int numero;
	protected float saldo;
	protected String senha;
	
	public Conta(int numero, float saldo, String senha) {
		this.numero = numero;
		this.saldo = saldo;
		this.senha = senha;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
	public float getSaldo(String senha) throws Exception {
		if (validarSenha(senha)) {
			return saldo;
		}else {
			throw new Exception("ErroPermissaoException");
		}	
	}
	
	public void depositar(float valor) throws Exception {
		if ( valor > 0 ) {
			this.saldo+=valor;
		} else {
			throw new Exception("ErroValorException");
		}
	}
	
	public void sacar(String senha, float valor) throws Exception {
		if (validarSenha(senha) && saldo >= valor ) {
			this.saldo -= valor;
		}else if (validarSenha(senha) == false ) {
			throw new Exception("ErroPermissaoException");
		}
		else if (valor > saldo) {
			throw new Exception("ErroSaldoException");
		}
		else if (valor <= 0 ) {
			throw new Exception("ErroValorException");
		}
	}
	
	public boolean validarSenha(String senha) {
		return this.senha.equals(senha);
	}
	
	@Override
	public String toString() {
		String output = "Conta: " + this.numero;
		if(this instanceof Poupanca)
			output += " (POUPANCA)";
		else if(this instanceof ContaCorrente)
			output += " (CONTA CORRENTE)";
		return output;
	}
}
