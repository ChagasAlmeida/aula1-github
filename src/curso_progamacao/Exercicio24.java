package curso_progamacao;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num, i;
		
		num = sc.nextInt();
		
		for (i = 1; i <= num; i++) {
			System.out.printf("%.0f ", i);
			System.out.printf("%.0f ",Math.pow(i, 2));
			System.out.printf("%.0f\n",Math.pow(i, 3));
		}
		sc.close();
	}
	
}
