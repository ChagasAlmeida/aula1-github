package curso_progamacao;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		num1 = sc.nextInt();	
		num2 = sc.nextInt();
		
		
		if (num1 > num2) {
			
			if (num1 % num2 == 0) {	
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}else if (num1 == num2) {
			System.out.println("Nao sao Multiplos");
			
		}else if (num1 < num2) {	
			
			if (num2 % num1 == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
			
		}
		
		sc.close();
		
	}

}
