
public class ConverteTemperatura {
	public static void main(String[] args) {
		double C, K, Re, Ra, F;
		C = 2.43;
		
		F = C * 1.8 + 32;
		K = C + 273.15;
		Re = C * 0.8;
		Ra = C * 1.8 + 32 + 459.67;
		
		System.out.println("A temperatura em Fahrenheint é: " + F);
		System.out.println("A temperatura em Kelvin é: " + K);
		System.out.println("A temperatura em Reamur é: " + Re);
		System.out.println("A temperatura em Rankine é: " + Ra);
	}
}
