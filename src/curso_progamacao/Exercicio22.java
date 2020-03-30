package curso_progamacao;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, i,fatorial = 1;
		
		num = sc.nextInt();
		
		if (num == 0) {
			fatorial = 0;
		}
		
		for (i = num; i > 1; i--) {
			
			fatorial *= i;
		}
		System.out.println(fatorial);
		sc.close();
	}

}
