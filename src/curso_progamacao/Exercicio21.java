package curso_progamacao;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q, i;
		double num1, num2, divisao;
		
		q = sc.nextInt();
		
		for (i=0; i < q; i++) {
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			
			if (num2 != 0) {
				divisao = num1 / num2;
				System.out.printf("%.1f\n", divisao);
			}else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}

}
