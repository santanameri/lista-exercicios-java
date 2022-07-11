import java.util.Scanner;

public class popularLuxo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double carro, diasAluguel, qtdKm, precoPopular=0, precoLuxo=0;
		
		System.out.print("Qual tipo de carro você deseja? 1-Popular e 2- Luxo: ");
		carro = ler.nextDouble();
		
		System.out.print("\nQuantos dias de aluguel você deseja?");
		diasAluguel = ler.nextDouble();
		
		System.out.print("\nQuantos Km serão percorridos?");
		qtdKm = ler.nextDouble();
		
		if (carro == 1 && qtdKm <= 100) {
			precoPopular = (diasAluguel*90) + (qtdKm*0.20);
			System.out.println("\nO preço do aluguel é de R$ " + precoPopular);
		} if (carro == 1 && qtdKm > 100) {
			precoPopular = (diasAluguel*90) + (qtdKm*0.10);
			System.out.println("\nO preço do aluguel é de R$ " + precoPopular);;
		} if (carro == 2 && qtdKm <= 200) {
			precoLuxo = (diasAluguel*150) + (qtdKm*0.30);
			System.out.println("\nO preço do aluguel é de R$ "+ precoLuxo);
		} if (carro == 2 && qtdKm > 200) {
			precoLuxo = (diasAluguel*150) + (qtdKm*0.25);
			System.out.println("\nO preço do aluguel é de R$ " + precoLuxo);
		}
	}
}
