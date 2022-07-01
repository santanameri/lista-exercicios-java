import java.util.Scanner;

public class Circunferencia_Braco {
	public static void main(String[] args) {
	Scanner cb = new Scanner(System.in);
	double circunferencia, percentil, adequacao = 0;
	
	System.out.print("Informe a circunferência do braço (CB) obtida: ");
	circunferencia = cb.nextDouble();
	System.out.print("Informe o valor referente ao percentil 50: ");
	percentil = cb.nextDouble();
	adequacao = (circunferencia / percentil) * 100;
	
	if(adequacao <70) {
		System.out.print("A adequação da CB é de " + adequacao + "%, classificada como: Desnutrição grave.");
	} else if(adequacao >=70 && adequacao <80) {
		System.out.print("A adequação da CB é de " + adequacao + "%, classificada como: Desnutrição moderada.");
	} else if(adequacao >=80 && adequacao <90) {
		System.out.print("A adequação da CB é de " + adequacao + "%, classificada como: Desnutrição leve.");
	} else if(adequacao >=90 && adequacao <110) {
		System.out.print("A adequação da CB é de " + adequacao + "%, classificada como: Eutrofia.");
	} else if(adequacao >=110 && adequacao <120) {
		System.out.print("A adequação da CB é de " + adequacao + "%, classificada como: Sobrepeso.");
	} else {
		System.out.print("A adequação da CB é de " + adequacao + "%, classificada como: Obesidade.");
	}
	}
}
