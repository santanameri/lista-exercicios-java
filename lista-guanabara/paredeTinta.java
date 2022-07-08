import java.util.Scanner;

public class paredeTinta {
	public static void main(String[] args) {
		Scanner testa = new Scanner(System.in);
		
		double largura, altura, area = 0.0, qtdTinta = 0.0;
		
		System.out.print("Digite a largura da parede: ");
		largura = testa.nextDouble();
		System.out.print("Digite a altura da parede: ");
		altura = testa.nextDouble();
		
		area = largura * altura;
		qtdTinta = area / 2;
		
		System.out.println("A área da parede é de " + area + "m².");
		System.out.println("Para pintar a parede usará " + qtdTinta + " litros de tinta.");
	}
}
