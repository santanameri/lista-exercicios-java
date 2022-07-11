import java.util.Scanner;

public class salarioGenero {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salario, genero, tempTrab=0, novoSalario=0;
		
		System.out.print("Informe o seu salário atual: ");
		salario = ler.nextDouble();
		System.out.print("Informe o gênero que você se identifica: 1- Mulher; 2- Homem.");
		genero = ler.nextDouble();
		System.out.println("Informe quantos anos você trabalha na empresa: ");
		tempTrab = ler.nextDouble();
		
		if (genero==1 && tempTrab<15) {
			novoSalario = salario + (salario*0.05);
			System.out.println("O seu salário atual é de R$ " + novoSalario);
		} if (genero==1 && tempTrab>=15 && tempTrab <=20) {
			novoSalario = salario + (salario*0.12);
			System.out.println("O seu salário atual é de R$ " + novoSalario);
		} if (genero==1 && tempTrab>20) {
			novoSalario = salario + (salario*0.23);
			System.out.println("O seu salário atual é de R$ " + novoSalario);
		} if (genero ==2 && tempTrab<20) {
			novoSalario = salario + (salario*0.03);
			System.out.println("O seu salário atual é de R$ " + novoSalario);
		} if (genero==2 && tempTrab>=20 && tempTrab<=30) {
			novoSalario = salario + (salario*0.13);
			System.out.println("O seu salário atual é de R$ " + novoSalario);
		} if (genero==2 && tempTrab>30) {
			novoSalario = salario + (salario*0.25);
			System.out.println("O seu salário atual é de R$ " + novoSalario);
		}
	}
}
