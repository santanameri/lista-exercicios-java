import java.util.Scanner;

public class diferencaIdade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe a sua idade: ");
		int idade = in.nextInt();
		System.out.println("Informe a idade da sua mãe: ");
		int idadeMae = in.nextInt();
		int diff = idadeMae-idade;
		
		System.out.printf("A sua mãe é %d anos mais velha que você!",diff);
	}

}
