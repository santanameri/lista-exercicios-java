import java.util.Scanner;

public class realDolar {
	public static void main(String[] args) {
		Scanner teste = new Scanner (System.in);
		
		double real, dolar = 3.45, total = 0.0;
		
		System.out.println("Quantos reais você tem na carteia?");
		real = teste.nextDouble();
		
		total = real / dolar;
		
		System.out.println("O valor que você tem na carteira corresponde a " + total + " dólares.");
	}
}
