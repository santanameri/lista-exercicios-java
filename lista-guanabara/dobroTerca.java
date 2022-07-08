import java.util.Scanner;

public class dobroTerca {
	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		
		double numero, dobro = 0.0, terca = 0.0;
		
		System.out.print("Digite um número: ");
		numero = teste.nextDouble();
		
		dobro = numero *2;
		terca = numero / 3;
		
		System.out.println("O dobro de " + numero + " é " + dobro);
		System.out.println("A terça parte de " + numero + " é " + terca);
	}
}
