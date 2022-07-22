package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class loopsEx02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int nota ;
		
		System.out.println("Nota: ");
		nota = input.nextInt();
		
		while(nota>=0 && nota<=10) {
			
			System.out.println("Nota: ");
			nota = input.nextInt();
			
			if (nota<0 || nota>10) {
				System.out.println("Nota inválida! Digite novamente: ");
				nota = input.nextInt();
			}
		}
	}
}
