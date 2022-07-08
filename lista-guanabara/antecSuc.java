import java.util.Scanner;

public class antecSuc {
	public static void main(String[] args) {
	Scanner teste  = new Scanner(System.in);
	
	int numero, ant = 1, suc = 1;
	
	System.out.print("Digite um número: ");
	numero = teste.nextInt();
	
	ant = numero - ant;
	suc = numero + suc;
	
	System.out.println("O antecessor de " + numero + " é " + ant + ".");
	System.out.println("O sucessor de " + numero + " é " + suc + ".");
	}
}
