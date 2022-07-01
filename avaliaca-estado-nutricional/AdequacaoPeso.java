import java.util.Scanner;

public class AdequacaoPeso {
public static void main(String[] args) {
	Scanner adequa = new Scanner(System.in);
	double peso_ideal, peso_atual, adequacao = 0;
	
	System.out.print("Informe o peso atual (Kg): ");
	peso_atual = adequa.nextDouble();
	System.out.print("Informe o peso ideal (Kg): ");
	peso_ideal = adequa.nextDouble();
	adequacao = (peso_atual / peso_ideal) * 100;
	
	if(adequacao <=70) {
		System.out.print("O percentual de adequação é de " + adequacao + "%, classificado como: Desnutrição grave.");
	} else if(adequacao >70.1 && adequacao <=80) {
		System.out.print("O percentual de adequação é de " + adequacao + "%, classificado como: Desnutrição moderada.");
	} else if(adequacao >80.1 && adequacao <=90) {
		System.out.print("O percentual de adequação é de " + adequacao + "%, classificado como: Desnutrição leve.");
	} else if(adequacao >90.1 && adequacao <=110) {
		System.out.print("O percentual de adequação é de " + adequacao + "%, classificado como: Eutrofia.");
	} else if(adequacao >110.1 && adequacao <=120) {
		System.out.print("O percentual de adequação é de " + adequacao + "%, classificado como: Sobrepeso.");
	} else {
		System.out.print("O percentual de adequação é de " + adequacao + "%, classificado como: Obesidade.");
	}
}
}
