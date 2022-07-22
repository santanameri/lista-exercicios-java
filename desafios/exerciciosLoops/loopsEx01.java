package loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class loopsEx01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			
			System.out.println("Nome: ");
			nome=input.next();
			
				if (nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade=input.nextInt();
		}
		
		System.out.println("Continua aqui...");
		
	}
}
