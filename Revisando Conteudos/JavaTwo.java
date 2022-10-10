package PacoteJava;

import java.util.Scanner;

public class JavaTwo {
	public static void main(String args[]) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, b, soma;
			System.out.println("Digite o valor de A: ");
			a = ler.nextInt();
			System.out.println("Digite o valor de B: ");
			b = ler.nextInt();
			soma = a + b;
			System.out.println(soma);
		}
		
	}
}
