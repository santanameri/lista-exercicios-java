import java.util.Scanner;

public class ImcIdoso {
	public static void main(String[] args) {
	double peso, altura, imc = 0;
	
	Scanner calculo = new Scanner (System.in);
	
	System.out.print("Informe o seu peso em quilos (Kg): ");
	peso = calculo.nextDouble();
	System.out.print("Informe a sua altura em metro (m): ");
	altura = calculo.nextDouble();
	imc = peso / Math.pow(altura, 2);
	System.out.println("O IMC do paciente é de: " + imc + " kg/m².");
	
	if(imc <= 22) {
		System.out.println("Desnutrição");
	} else {
		if(imc >= 22.1 && imc <= 26.9) {
			System.out.println("Eutrofia");
		} else
			if(imc >= 27) 
				System.out.println("Obesidade");
	}
	}
}
