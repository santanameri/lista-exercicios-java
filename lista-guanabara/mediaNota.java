import java.util.Scanner;

public class mediaNota {
	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		double nota1, nota2, media;
						
		System.out.print("Informe a 1° nota: ");
		nota1 = teste.nextDouble();
		System.out.print("Informe a 2° nota: ");
		nota2 = teste.nextDouble();
		
		media = (nota1+nota2)/2;
		
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media + ".");
	}
}
