import java.util.Scanner;

public class numeroSoma {
		public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.print("Digite um valor: ");
		n1 = teste.nextInt();
		System.out.print("Digite outro valor: ");
		n2 = teste.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a " + soma +".");
		}
}
