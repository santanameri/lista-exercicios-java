package primeirarodada;

import java.util.Scanner;

/* Faça um código para contabilizar a pontuação de apostadores de 
 * um bolão dos jogos da copa do mundo. No qual o jogador fará 3 
 * pontos ao acertar o placar, 4 pontos quando acertar o número de
 * gols dos dois times, 2 pontos quando acertar o número de gols de
 * apenas um dos times e 0 pontos quando não acertar nada.
 */

public class Pontuacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pontuacao = 0;
		
		System.out.println("Qual o nome do jogador?");		
		String nome = input.nextLine();
		
		System.out.println("Qual foi o placar do jogo? Responda no seguinte formato: Ex. 2 a 1");
		String placar = input.nextLine();
		
		System.out.println("Qual placar " + nome + " apostou? Responda no seguinte formato: Ex. 2 a 1");
		String placarAposta = input.nextLine();
		
		System.out.println("Qual o número de gols que o time 1 fez?");
		int Time1 = input.nextInt();
		
		System.out.println("Qual o número de gols " + nome + " apostou que o time 1 faria?");
		int Time1Aposta = input.nextInt();
		
		System.out.println("Qual o número de gols que o time 2 fez?");
		int Time2 = input.nextInt();
		
		System.out.println("Qual o número de gols " + nome + " apostou que o time 2 faria?");
		int Time2Aposta = input.nextInt();
		
		if (placar.equals(placarAposta)) {
			pontuacao = pontuacao + 3;
		} 
		if (Time1 == Time1Aposta && Time2 == Time2Aposta) {
			pontuacao = pontuacao + 4;
		}
		else if (Time1 == Time1Aposta || Time2 == Time2Aposta) {
			pontuacao = pontuacao + 2;
		} 
		else {
			pontuacao = pontuacao + 0;
		}
		
		input.close();
		
		System.out.println(nome + " obteve pontuação total de: " + pontuacao + " pontos.");
	}
}
