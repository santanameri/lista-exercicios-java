
public class MediaAri {
	public static void main(String[] args) {
	int a, b, c, d, e, f, media1, media2, media3 = 0;
	
	a = 4;
	b = 5;
	c = 6;
	d = 7;
	e = 8;
	f = 9;
	media1 = (a + b + c) / 3;
	
	System.out.println("O valor da média aritmética dos números 4, 5 e 6 é: " + media1);
	
	media2 = (d + e + f) / 3;
	
	System.out.println("O valor da média aritmética dos números 7, 8 e 9 é: " + media2);
	
	media3 = (media1 + media2) / 2;
	
	System.out.println("O valor da média das médias anteriores é de: " + media3);
	}
}
