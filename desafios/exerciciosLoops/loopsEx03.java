package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class loopsEx03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n, maiorN=0, soma=0, cont=0;
		
		do {
			System.out.println("Número: ");
			n = input.nextInt();
			
			soma = soma + n;
			
			if (n>maiorN) maiorN = n;
			
			cont = cont+1;
						
		} while (cont <5);
		
		System.out.println("Maior número: "+maiorN);
		System.out.println("Média dos números: "+(soma/5));
	}
}
