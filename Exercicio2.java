package estrururaCondicional;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite o valor classificado positivo ou negativo");
		valor = ler.nextInt();
		
		if (valor >0 ) {
			System.out.println("O valor inserido é positivo");
		}
		
		else if (valor ==0) {
			System.out.println("O valor equivale a 0");
		}
		
		else {
			System.out.println("O valor inserido é negativo");
		}
		

	}

}
