
public class QtAzulejo {
	public static void main(String[] args) {
		double hp, lp, ha, la, qtd;
		
		hp = 2.6;
		lp = 1.6;
		ha = 0.35;
		la = 0.3;
		
		qtd = (hp * lp) / (ha * la);
		
		System.out.println("A quantidade de azulejos necessários para cobrir a parede é de " + qtd);
	}
}
