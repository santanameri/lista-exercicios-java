import java.util.Scanner; 

public class carroCusto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double qtdKm, qtdDia, custo;
		
		System.out.println("Informe a quantidade de Km percorridos: ");
		qtdKm = ler.nextDouble();
		System.out.println("Informe a quantidade de dias: ");
		qtdDia = ler.nextDouble();
		
		custo = (qtdKm*0.20) + (qtdDia*90);
		
		System.out.println("O custo do aluguel do carro foi de R$ " + custo);
	}
}
