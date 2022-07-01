import java.util.Scanner;

public class TriagemMNA {
	public static void main(String[] args) {
		Scanner triagem = new Scanner(System.in);
		int diminuicao_ingesta, perda_peso, mobilidade, stress, problemas, imc, pontuacao = 0;
	
		System.out.println("Nos últimos três meses houve diminuição da ingesta alimentar devido a perda de apetite, problemas digestivos ou dificuldade para mastigar ou deglutir? Insira 0 para diminuição grave da ingesta; 1 para diminuição moderada da ingesta; ou 2 para sem diminunição da ingesta.");
		diminuicao_ingesta = triagem.nextInt();
		System.out.println("Perda de peso nos últimos 3 meses: Insira 0 para perda superior a 3Kg; 1 para não sabe informar; 2 para entre 1Kg e 3Kg; ou 3 para sem perda de peso.");
		perda_peso = triagem.nextInt();
		System.out.println("Mobilidade: Insira 0 para restrito ao leito ou à cadeira de rodas; 1 para deambula mas não é capaz de sair de casa; ou 2 para normal.");
		mobilidade = triagem.nextInt();
		System.out.println("Passou por algum stress psicológico ou doença aguda nos últimos três messes? Insira 0 para sim; ou 2 para não.");
		stress = triagem.nextInt();
		System.out.println("Problemas neuropsicológicos: Insira 0 para demência ou depressão grave; 1 para demência ligeira; ou 2 para sem problemas psicológicos.");
		problemas = triagem.nextInt();
		System.out.println("Índice de Massa Corporal = peso em kg/ estatura em m²: Insira 0 para IMC <19; 1 para 19<= IMC <21; 2 para 21 <= IMC < 23; ou IMC >= 23.");
		imc = triagem.nextInt();
		pontuacao = diminuicao_ingesta + perda_peso + mobilidade + stress + problemas + imc;
	
		if(pontuacao >= 12 && pontuacao <14) {
			System.out.println("A pontuação da triagem foi de " + pontuacao + ", classificado como: estado nutricional normal.");
		} else if(pontuacao >=8 && pontuacao <11) {
			System.out.println("A pontuaçao da triagem foi de " + pontuacao + ", classificado como: sob ricos de desnutrição.");
		} else {
			System.out.println("A pontuação da triagem foi de " + pontuacao + ", classificado como: desnutrido.");
		}
		
		double casa, medicamento, lesao, refeicao, porcao, fruta, liquido, modo, problema, saude, braquial, perna, avaliacao_global, pontuacao_total = 0;
		
		System.out.println("O doente vive na sua própria casa. Insira 1 para sim ou 2 para não.");
		casa = triagem.nextDouble();
		System.out.println("Utiliza mais de três medicamentos diferentes por dia? Insira 0 para sim ou 1 para não.");
		medicamento = triagem.nextDouble();
		System.out.println("Lesões de pele ou escaras? Insira 0 para sim ou 1 para não.");
		lesao = triagem.nextDouble();
		System.out.println("Quantas refeições faz por dia? Insira 0 para uma refeição; 1 para duas refeições; ou 2 para três refeições.");
		refeicao = triagem.nextDouble();
		System.out.println("O doente consome: pelo menos uma porção diária de leite ou derivados? Duas ou mais porções semanais de leguminosas ou ovos? Carne, peixe ou aves todos os dias? Insira 0.0 para nenhuma ou uma resposta sim; 0.5 para duas respostas sim; ou 1.0 para três respostas sim.");
		porcao = triagem.nextDouble();
		System.out.println("O doente consome duas ou mais porções diárias de fruta ou produtos hortícolas? Insira 0 para não; ou 1 para sim.");
		fruta = triagem.nextDouble();
		System.out.println("Quantos copos de líquidos (água, sumo, café, chá, leite) o doente consome por dia? Insira 0.0 para menos de três copos; 0.5 para três a cinco copos; ou 1.0 para mais de cinco copos.");
		liquido = triagem.nextDouble();
		System.out.println("Modo de se alimentar: Insira 0 para não é capaz de se alimentar sozinho; 1 para alimentar-se sozinho, porém com dificuldade; ou 2 para alimentar-se sozinho sem dificuldade.");
		modo = triagem.nextDouble();
		System.out.println("O doente acredita ter algum problema nutricional? Insira 0 para acredita estar desnutrido; 1 para não saber dizer; ou 2 para não acredita ter um problema nutricional.");
		problema = triagem.nextDouble();
		System.out.println("Em comparação com outras pessoas da mesma idade, como considera o doente a sua própria saúde? Insira 0.0 para pior; 0.5 para não sabe; 1.0 para igual; ou 2.0 para melhor.");
		saude = triagem.nextDouble();
		System.out.println("Perímetro braquial (PB) em cm: Insira 0.0 para PB <21; 0.5 para 21<= PB <=22; ou 1.0 para PB >22");
		braquial = triagem.nextDouble();
		System.out.println("Perímetro da perna (PP) em cm: Insira 0 para PP <3; ou 1 para PP >= 31.");
		perna = triagem.nextDouble();
		avaliacao_global = casa + medicamento + lesao + refeicao + porcao + fruta + liquido + modo + problema + saude + braquial + perna;
		pontuacao_total = pontuacao + avaliacao_global;
		
		if(pontuacao_total >= 24 && pontuacao_total <=30) {
			System.out.println("Estado Nutricional Normal");
		} else if(pontuacao_total >= 17 && pontuacao_total <=23.5) {
			System.out.println("Sob Risco de Desnutrição");
		} else {
			System.out.println("Desnutrido");
		}
		
	}
}
