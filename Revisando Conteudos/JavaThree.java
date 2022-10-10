package PacoteJava;

import java.util.Scanner;

public class JavaThree {
	public static void main (String args[]) {
		try (Scanner ler = new Scanner (System.in)) {
			int idade;
			String nome;
			System.out.println("Por favor, digite seu nome: ");
			nome = ler.nextLine();
			ler.nextLine();
			System.out.println("Agora, digite sua idade: ");
			idade = ler.nextInt();
			System.out.printf("\nSeu nome é: %s",nome);
			System.out.printf("\nSua idade é: %d",idade);
			
			if(idade>=18)
			{
				System.out.println("\nVocê pode entrar da balada amigo(a)!!!");
			}
			else if(idade>=1 && idade<18) 
			{
				System.out.println("\nVocê não pode entrar na balada amigo(a)!!!");
			}
			else
			{
				System.out.println("\nVocê digitou uma idade inválida!!!");
			}
		}
	}

}
