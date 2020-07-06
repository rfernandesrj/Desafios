package desafio;

import java.util.Scanner;

public class Utilizador {

	public static void main(String[] args) {

		Detetive detetive = new Detetive();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o suspeito: ");
		int suspeito = scanner.nextInt();
		
		System.out.print("Digite o local: ");
		int local = scanner.nextInt();
		
		System.out.print("Digite a arma: ");
		int arma = scanner.nextInt();
		
		detetive.armazenaResposta(suspeito, local, arma);
		int[] resposta = detetive.investiga();
		
		String respostaFormatada = detetive.formataResposta(resposta);
		System.out.println("Resposta: " + respostaFormatada);
		
	}

}
