import java.util.Scanner;

public class loginSenha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 1) Informe o login
		System.out.println("Login: ");
		String login = in.nextLine();
		// 2) Informe a senha
		System.out.println("Senha: ");
		String senha = in.nextLine();
		
		// 3) Armezenar as variáveis login e senha
		// 4) Verificar se o login e senha estão corretos
		// Comparando uma instância (objeto) com uma String
		
		if (login.equals("Maria") && senha.equals("234567")) {
			System.out.printf("Usuário %s logado com sucesso.", login);
		} else {
			System.out.println("Login ou senha inváldos!");
		}
	}

}
