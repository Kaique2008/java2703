package estrururaCondicional;
import java.util.Scanner;

public class caixaeletronico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		long cpf;
		int cpfc, senhac;
		long senha;
		double saldo, saque = 0, sfnl = 0;
		
		System.out.println("Digite seu cpf");
		cpf = ler.nextLong();
		
		System.out.println("Digite a sua senha");
		senha = ler.nextLong();
		
		cpfc = 478058368;
		senhac = 1910;
		saldo = 500000;
		
		if (cpf == cpfc && senha == senhac) {
			System.out.println("Quanto você quer sacar");
			saque = ler.nextDouble();
			
			if (saque <=saldo) {
				sfnl = saldo-saque;
				System.out.println("Saque concluido");
				System.out.println("Seu saldo atual é " +sfnl);
				System.out.println("Transação concluida");
			}
			
			else {
				System.out.println("Saldo insuficiente");
			}
		}
		
		else {
			System.out.println("Tente novamente");
		}
		
		ler.close();
	}
}
