package curso_progamacao;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q, i;
		double num1, num2, num3, media;
		
		q = sc.nextInt();
		
		for (i = 0; i < q; i++) {
			num1 = sc.nextFloat();
			num2 = sc.nextFloat();
			num3 = sc.nextFloat();
			
			media = 0.2*num1 + 0.3*num2 + 0.5*num3;
			
			System.out.printf("%.1f\n",media);
		}
		sc.close();	
	}
	
}
