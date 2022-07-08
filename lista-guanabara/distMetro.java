import java.util.Scanner;

public class distMetro {
	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		double distMetro, km=0.0, hm=0.0, dam=0.0, dm=0.0, cm=0.0, mm=0;
		
		System.out.println("Digite uma distância em metros: ");
		distMetro = teste.nextDouble();
		
		km = distMetro / 1000;
		hm = distMetro / 100;
		dam = distMetro / 10;
		dm = distMetro * 10;
		cm = distMetro * 100;
		mm = distMetro * 1000;
		
		System.out.println("A distância de " + distMetro + "m corresponde a: ");
		System.out.println(km + "Km");
		System.out.println(hm + "Hm");
		System.out.println(dam + "Dam");
		System.out.println(dm + "dm");
		System.out.println(cm + "cm");
		System.out.println(mm + "mm");
	}
}