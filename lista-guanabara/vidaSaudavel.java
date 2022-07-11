import java.util.Scanner;

public class vidaSaudavel {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double hora, totalPonto=0, valor=0;
		
		System.out.print("Quantas horas de atividade física foram feitas?");
		hora = ler.nextDouble();
		
		if (hora<=10) {
			totalPonto = hora*2;
			System.out.println(hora + " horas de atividade equivalem a " + totalPonto + " pontos.");
			valor = totalPonto*0.05;
			System.out.println("\nO valor ganho foi de: R$ " + valor);
		} if (hora>10 && hora<=20) {
			totalPonto = hora*5;
			System.out.println(hora + " horas de atividade equivalem a " + totalPonto + " pontos.");
			valor = totalPonto*0.05;
			System.out.println("\nO valor ganho foi de: R$ " + valor);
		} else {
			totalPonto = hora*10;
			System.out.println(hora + " horas de atividade equivalem a " + totalPonto + " pontos.");
			valor = totalPonto*0.05;
			System.out.println("\nO valor ganho foi de: R$ " + valor);
		}
	}
}
