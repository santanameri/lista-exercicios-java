import java.util.Scanner;

public class CalculaCardapio {
	public static void main(String[] args) {
		Scanner calcula = new Scanner(System.in);
		int prato, sobremesa, bebida = 0;
		
		System.out.println("Para escolher um prato principal insira: 0-Vegetariano; 1-Peixe; 2-Frango; 3-Carne");
		prato = calcula.nextInt();
		
		if(prato<1) {
			System.out.println("O valor calórico do prato vegetariano é de 180 cal.");
		} else if(prato>=1 && prato <2) {
			System.out.println("O valor calórico do prato de peixe é de 230 cal.");
		} else if(prato >=2 && prato <3) {
			System.out.println("O valor calórico do prato de frango é de 250 cal.");
		} else {
			System.out.println("O valor calórico do prato de carne é de 350 cal.");
		}
		
		System.out.println("Para escolher a sobremesa insira: 0-Abacaxi; 1-Sorvete diet; 2-Mousse diet; 3-Mousse chocolate");
		sobremesa = calcula.nextInt();
		
		if(sobremesa<1 ) {
			System.out.println("O valor calórico da sobremesa de abacaxi é de 75 cal.");
		} else if(sobremesa>=1 && sobremesa <2) {
			System.out.println("O valor calórico do sorvete diet é de 110 cal.");
		} else if(sobremesa>=2 && sobremesa <3) {
			System.out.println("O valor calórico do mousse diet é de 170 cal.");
		} else {
			System.out.println("O valor calórico do mousse de chocolate é de 200 cal.");
		}
		
		System.out.println("Para escolher a bebida insira: 0-Chá; 1-Suco de laranja; 2-Suco de melão; 3-Refrigerante diet");
		bebida = calcula.nextInt();
		
		if(bebida<1) {
			System.out.println("O valor calórico do chá é de 20 cal.");
		} else if(bebida >=1 && bebida <2) {
			System.out.println("O valor calórico do suco de laranja é de 70 cal.");
		} else if(bebida >=2 && bebida <3) {
			System.out.println("O valor calórico do suco de melão é de 100 cal.");
		} else {
			System.out.println("O valor calórico do refrigerante diet é de 65 cal.");
		}
	}
}
