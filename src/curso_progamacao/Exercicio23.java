package curso_progamacao;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, i;
		
		num = sc.nextInt();
		
		for (i = 1; i<=num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
