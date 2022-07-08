import java.util.Scanner;

public class velocidadeMulta {
	public static void main(String[] args) {
		Scanner testa = new Scanner(System.in);
		
		double velocidade, multa = 5.0, cobranca;
		
		System.out.println("Informe a velocidade do carro: ");
		velocidade = testa.nextDouble();
		
		if(velocidade>80) {
			System.out.println("Você foi multado!");
			cobranca = (velocidade - 80) * multa;
			System.out.println("O valor da multa é de R$ " + cobranca);
		} else {
			System.out.println("Velocidade dentro do permitido, siga em frente!");
		}
	}
}
