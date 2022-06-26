import java.util.Scanner;

public class GrupoPessoas {
	public static void main(String[] args) {
	int sexo, qtMulheres=0, qtHomens=0;
	float altura, somaH=0, mediaHomens=0, maior=0, menor=0;
	
	Scanner entrada = new Scanner(System.in);
	
	for (int i=0; i<10; i++) {
		System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
		sexo = entrada.nextInt();
		System.out.print("Digite a altura: ");
		altura = entrada.nextFloat();
		if(sexo == 1) {
			qtMulheres++;
		} else if(sexo == 2) {
			qtHomens++;
			somaH = somaH + altura;
		} else {
			System.out.println("Opção sexo inválido!");
		}
		if(i == 0) {
			menor = altura;
			maior  = altura;
		} else {
			if(altura>maior) {
				maior = altura;
			} else if (altura<menor) {
				menor = altura;
			}
		}
	mediaHomens = somaH / qtHomens;
	
	}
		System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é " + menor + " m");
		System.out.println("A média de altura dos homens é " + mediaHomens + " m");
		System.out.println("O número de mulheres é " + qtMulheres);
		entrada.close();
	}
}
