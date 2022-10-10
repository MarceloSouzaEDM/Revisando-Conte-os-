package PacoteJava;

import java.util.Scanner;

public class JavaSix {
	public static void main(String Args[]) {
		try (Scanner oi = new Scanner (System.in)) {
			int idade;
			System.out.printf("Entre com a sua idade: ");
			idade = oi.nextInt();
			
			do
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
			    } while(idade >=1);
			
		}
			
			
		
		
		
	}
	}


