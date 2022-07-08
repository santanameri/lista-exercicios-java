import java.util.Scanner;

public class distanciaPreco {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double distancia, preco;
		
		System.out.println("Qual a distância a ser percorrida? ");
		distancia = leia.nextDouble();
		
		if (distancia <= 200) {
			preco = distancia * 0.5;
					System.out.println("O preço da passagem é R$ " + preco);
		} else {
			preco = distancia * 0.45; 
					System.out.println("O preço da passagem é R$ " + preco);
		}
	}
}
