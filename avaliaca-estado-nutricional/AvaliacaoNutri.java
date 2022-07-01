import java.util.Scanner;

public class AvaliacaoNutri {
	public static void main(String[] args) {
	String nome, idade, genero;
	double imc, peso, altura = 0;
	
	Scanner avaliacao = new Scanner (System.in);
	
	System.out.print("Informe o seu nome: ");
	nome = avaliacao.nextLine();
	System.out.print("Informe a sua idade: ");
	idade = avaliacao.nextLine();
	System.out.print("Informe o seu gênero: ");
	genero = avaliacao.nextLine();
	System.out.print("Aferir e inserir o peso do paciente: ");
	peso = avaliacao.nextDouble();
	System.out.print("Medir e inserir a altura do paciente: ");
	altura = avaliacao.nextDouble();
	imc = peso / Math.pow(altura, 2);
	System.out.println("O IMC do paciente é: " + imc);
	System.out.print("O paciente " + nome + ", " + idade + " anos, de gênero " + genero + ", pesa " + peso + " Kg e mede " + altura + "metros, obtendo um IMC de " + imc + ".");
	
	}
}
