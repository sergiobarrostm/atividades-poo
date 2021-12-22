package br.ufal.carro;

public class Carro {

	private String modelo;
	private String cor;
	private int velocidade;
	private Tanque tanque;
	private Motor motor;

	public Carro(String modelo, String cor, Motor motor, int tanque) {
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.velocidade = 0;
		this.tanque = new Tanque(tanque);
	}

	public void ligar() {
		this.motor.ligar();
        System.out.println(this.modelo + " está ligado");
	}

	public void desligar() {
		if (this.getVelocidade() > 0) {
			this.freiar();
			System.out.println(this.modelo + " está freando");
		}
		
		this.motor.desligar();
        System.out.println(this.modelo + " está desligado");
		
	}

	public void acelerar(int quantCombustivel) {
		int quantCombustivelUsado = this.tanque.usarCombustivel(quantCombustivel);
		
		this.motor.acelerar(this, quantCombustivelUsado);
		System.out.println(this.modelo + " acabou de acelerar. Sua velocidade é " + this.getVelocidade() + " km/h" );
		
		if (quantCombustivelUsado < quantCombustivel) {
			this.desligar();
		} 
	}

	public void freiar() {
		this.setVelocidade(0);
	}

	protected void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void abastecer(int quantCombustivel) {
		this.tanque.abastecer(quantCombustivel);
        System.out.println(this.modelo + " acabou de abastecer " + quantCombustivel + " unidades de combustivel" );
	}

}
