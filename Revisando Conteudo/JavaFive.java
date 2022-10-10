package PacoteJava;

import java.util.Scanner;

public class JavaFive {
	public static void main (String args[]) {
		try (Scanner oi = new Scanner (System.in)) {
			int idade;
			System.out.printf("Entre com a sua idade: ");
			idade = oi.nextInt();
			
			while(idade >=1)
			    {
				System.out.printf("\nSua idade é: %d",idade);
				if(idade >= 18)
				{
					System.out.printf("\nPode entrar garotinho(a)");
				}
				else
				{
					System.out.printf("\nVocê está barrado");
				}
				System.out.printf("\nEntre com a sua idade: ");
				idade = oi.nextInt();
			}
			
		}
			
			
		
		
		
	}

}
