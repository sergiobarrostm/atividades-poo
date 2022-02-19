package br.ufal.aracomp.transacoesBancarias.main;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.transacoesBancarias.Conta;
import br.ufal.aracomp.transacoesBancarias.ContaCorrente;
import br.ufal.aracomp.transacoesBancarias.Poupanca;

public class Main {
	public static void main(String[] args) throws Exception  {
		List<Conta> contas = new ArrayList<>();
		contas.add(new Poupanca(1, 250, "senha1", 0.02f));
		contas.add(new Poupanca(2, 1200.50f, "senha2", 0.02f));
		contas.add(new Poupanca(3, 5052.65f, "senha1", 0.02f));
		
		contas.add(new ContaCorrente(1, 250, "senha1", 500));
		contas.add(new ContaCorrente(1, 2500, "senha2", 1000));
		contas.add(new ContaCorrente(1, 250, "senha1", 100));

		
		System.err.println("\n\nContas do Banco:");
		for(Conta c : contas) {
			System.out.println(c);
		}
		
		
		//transacoes nas contas
		//saldo
		System.err.println("\nSaldo das contas:");
		for(Conta c:contas) {
			try {
				System.out.println("Conta: " + c.getNumero() + " = " + c.getSaldo("senha1"));
			} catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		//deposito
		System.err.println("\nDepositando R$ 10 nas contas:");
		for(Conta c:contas) {
			try {
				c.depositar(10);
				System.out.println("Deposito realizado com sucesso na Conta: " + c.getNumero() + ". Novo saldo = " + c.getSaldo("senha1"));
			} catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		//deposito
		System.err.println("\nDepositando R$ -10 nas contas:");
		for (Conta c : contas) {
			try {
				c.depositar(-10);
				System.out.println("Deposito realizado com sucesso na Conta: " + c.getNumero() + ". Novo saldo = " + c.getSaldo("senha1"));
			} catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		// saque
		System.err.println("\nSacando R$ 500 nas contas:");
		for (Conta c : contas) {
			try {
				c.sacar("senha1", 500);
				System.out.println("Saque realizado com sucesso na Conta: " + c.getNumero() + ". Novo saldo = "
						+ c.getSaldo("senha1"));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
