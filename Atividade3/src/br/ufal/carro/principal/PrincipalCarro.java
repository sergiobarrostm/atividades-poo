package br.ufal.carro.principal;

import br.ufal.carro.Carro;
import br.ufal.carro.Motor;
import br.ufal.carro.MotorDiesel;
import br.ufal.carro.MotorFlex;

public class PrincipalCarro {
	public static void main(String[] args) {
		
		Motor flex = new MotorFlex();
		Motor diesel = new MotorDiesel();
		
		Carro compass = new Carro("Jeep Compass", "branco" , flex , 60);
		Carro civic = new Carro("Honda civic", "cinza" , diesel , 50);
		
		compass.ligar();
		compass.acelerar(10);
		
		compass.abastecer(10);
		compass.ligar();
		compass.acelerar(10);
		
		civic.abastecer(10);
		civic.ligar();
		civic.acelerar(10);		
	}
}
