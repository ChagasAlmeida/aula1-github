package curso_progamacao;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q, i, somaIn = 0, somaOut = 0;
		float num;
		
		q = sc.nextInt();
		
		for (i = 0; i != q; i++) {
			num = sc.nextFloat();
			if (10 <= num  && num <= 20) {
				somaIn += 1;
			}else {
				somaOut += 1;
			}
			
		}
		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");
		
		sc.close();
	}
	
}
