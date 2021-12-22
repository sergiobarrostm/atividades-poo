package br.ufal.carro;

public interface IMotor {
	public void ligar();

	public void desligar();

	public boolean isLigado();
	
	public void acelerar(Carro c, int quantCombustivel);

}
