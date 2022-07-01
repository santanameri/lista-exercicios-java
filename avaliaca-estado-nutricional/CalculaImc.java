import java.util.Scanner;

public class CalculaImc {
	public static void main(String[] args) {
	double peso, altura, imc = 0;
	
	Scanner calculadora = new Scanner (System.in);
	
	System.out.print("Informe o seu peso em quilos (Kg): ");
	peso = calculadora.nextDouble();
	System.out.print("Informe a sua altura em metros (m): ");
	altura = calculadora.nextDouble();
	imc = peso / Math.pow(altura, 2);
	System.out.println("O IMC do paciente é de: " + imc + " kg/m².");
	
	if(imc <= 18.5) {
		System.out.print("Baixo peso");
	} else {
		if(imc >= 18.6 && imc <= 24.9) {
			System.out.println("Eutrofia");
		} else {
			if(imc >= 25 && imc <=29.9) {
				System.out.println("Sobrepeso");
			} else {
				if(imc >= 30)
					System.out.println("Obesidade");
			}
		}
	}
	}
}
