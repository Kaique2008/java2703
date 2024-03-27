package estrururaCondicional;
import java.util.Scanner;

public class Numeropareimpar {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite o valor par ou ímpar");
		valor = ler.nextInt();
		
		if (valor % 2 ==1) {
			System.out.println("O valor inserido é impar");
		
		
	}
	
		else {
			System.out.println("O valor inserido é par");
		}
		ler.close();
		
	}
	

}
