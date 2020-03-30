package curso_progamacao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi, hf, duracao;
		
		hi = sc.nextInt();
		hf = sc.nextInt();
		
		if (hf > hi) {
			duracao = hf - hi;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
			
		}else {
			duracao = (hf+24) - hi;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}
		
		sc.close();
	}

}
