import java.util.Scanner;

public class idadeVoto {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int nascimento, idade;
			
			System.out.println("Informe o ano do seu nascimento: ");
			nascimento = leia.nextInt();
			
			idade = 2022 - nascimento;
			
			if (idade >= 18) {
				System.out.println("De acordo com a sua idade, você é obrigado a votar!");
			} else if (idade >= 16 && idade <18) {
				System.out.println("De acordo com a sua idade, você já pode votar, mas não é obrigatório!");
			} else {
				System.out.println("De acordo com a sua idade, você ainda não pode votar!");
			}
		}
}
