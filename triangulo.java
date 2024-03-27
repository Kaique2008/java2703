package estrururaCondicional;
import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.println("Digite um dos valores a ser calculado");
		valor1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor a ser calculado");
		valor2 = ler.nextInt();
		
		System.out.println("Digite o terceiro valor a ser calculado");
		valor3 = ler.nextInt();
		
		if (valor1 == valor2 && valor1 == valor3) {
			System.out.println("É um triangulo equilátero");
		}
		
		else if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			System.out.println("É um triangulo escaleno");
		}
		
		else {
			System.out.println("É um triangulo isósecles");
		}
		ler.close();
	}

}
