import java.util.Scanner;

public class idadeDiferenca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, diferenca1, diferenca2;
		
		System.out.println("Informe a sua idade: ");
		idade = leia.nextInt();
		
		diferenca1 = 18 - idade;
		diferenca2 = idade - 18;
		
		if (idade < 18) {
			System.out.println("Faltam " + diferenca1 + " anos para o alistamento militar.");
		} else {
			System.out.println("Já se passaram " + diferenca2 + " anos para o alistamento.");
		}

	}

}
