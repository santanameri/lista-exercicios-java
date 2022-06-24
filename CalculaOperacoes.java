import java.util.Scanner;

public class CalculaOperacoes {
	public static void main(String[] args) {
	double a, b, c, d, e, f = 0;
	Scanner s = new Scanner (System.in);
	System.out.print("Insira o valor 1: ");
	a = s.nextDouble();
	System.out.print("Insira o valor 2: ");
	b = s.nextDouble();
	c = a + b;
	System.out.println("A soma entre a e b é igual a: " + c);
	d = a - b;
	System.out.println("A substração entre a e b é igual a: " + d);
	e = a * b;
	System.out.println("O produto entre a e b é igual a: " + e);
	f = a / b;
	System.out.println("A divisão entre a e b é igual a: " + f);
	}
}
