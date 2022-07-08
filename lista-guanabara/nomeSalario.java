import java.util.Scanner;

public class nomeSalario {
	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		String nome;
		double salario;
		
		System.out.println("Informe o seu nome completo: ");
		nome = teste.nextLine();
		System.out.println("Informe o seu salário: R$");
		salario = teste.nextDouble();
		
		System.out.println("Nome do Funcionário: " + nome);
		System.out.println("Salário: R$" + salario);
		System.out.println("O funcionário " + nome + " tem um salário de R$"+ salario + " em Junho.");
				
	}
}
