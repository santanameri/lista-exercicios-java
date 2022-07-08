import java.util.Scanner;

public class alunoMedia {
	
	public static void main(String[] args) {
		String nome;
		int n1, n2, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite a 1° nota: ");
		n1 = leia.nextInt();
		System.out.println("Digite a 2° nota: ");
		n2 = leia.nextInt();
		
		media = (n1 = n2) / 2;
		
		if (media >= 7) {
			System.out.println("O aluno teve um bom aproveitamento!");
		} else {
			System.out.println("O aluno não teve um bom aproveitamento!");
		}
		
	}
}