package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class loopsEx04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero, qtdN, qtdPar=0, qtdImpar=0,count = 0;
		
		System.out.println("Quantidade de números: ");
		qtdN = input.nextInt();
		
		do {
			System.out.println("Número: ");
			numero = input.nextInt();
			if (numero%2==0) {
				qtdPar++;
			} else {
				qtdImpar++;
			}
			
			count++;
		} while (count < qtdN);
		
		System.out.println("Quantidade de números pares: "+qtdPar);
		System.out.println("Quantidade de números ímpares: "+qtdImpar);
	}
}
