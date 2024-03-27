package estrururaCondicional;
import java.util.Scanner;

public class Exercicio2703 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite o valor");
		valor = ler.nextInt();
		
		if (valor ==1) {
			System.out.println("Janeiro");
		}
		
		else if (valor ==2) {
			System.out.println("Fevereiro");
		}
		
		else if (valor ==3) {
			System.out.println("Março");
		}
		
		else if (valor ==4) {
			System.out.println("Abril");
		}
		
		else if (valor ==5) {
			System.out.println("Maio");
		}
		
		else if (valor ==6) {
			System.out.println("Junho");
		}
		
		else if (valor ==7) {
			System.out.println("Julho");
		}
		
		else if (valor ==8) {
			System.out.println("Agosto");
		}
		
		else if (valor ==9) {
			System.out.println("Setembro");
		}
		
		else if (valor ==10) {
			System.out.println("Outubro");
		}
		
		else if (valor ==11) {
			System.out.println("Novembro");
			
	     }
		
		else if (valor ==12) {
			System.out.println("Dezembro");
		}
		
		else if (valor >=13) {
			System.out.println("Mês inválido");
		}
	}
}
