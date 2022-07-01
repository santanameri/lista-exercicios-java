import java.util.Scanner;
public class triagemhosp {
	public static void main(String[] args) {
	String nome, idade, sexo, sintomas, comorbidades;
	Scanner s = new Scanner (System.in);
	System.out.print("Informe o seu nome: ");
	nome = s.nextLine();
	System.out.print("Informe a sua idade: ");
	idade = s.nextLine();
	System.out.print("Informe o seu gênero: ");
	sexo = s.nextLine();
	System.out.print("Informe os sintomas que possui: ");
	sintomas = s.nextLine();
	System.out.print("Informe se possui alguma comobirdade: ");
	comorbidades = s.nextLine();
	System.out.println("O paciente " + nome + ", " + idade + " anos" + ", de gênero " + sexo + ". Possui os seguintes sintomas: " + sintomas + ". E as seguintes comorbidades: " + comorbidades + ".");
	
	}
}
