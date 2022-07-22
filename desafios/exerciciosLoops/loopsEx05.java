package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class loopsEx05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tabuada;
		
		System.out.println("Tabuada: ");
		tabuada = input.nextInt();
		
		System.out.println("\nTabuada de " +tabuada);
		
		for (int i=1; i<=10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
		}
	}
}
