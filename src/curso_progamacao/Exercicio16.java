package curso_progamacao;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float x, y;
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
				
			}else if (x < 0 && y > 0) {
				System.out.println("segundo");
				
			}else if (x < 0 && y < 0) {
				System.out.println("terceiro");
				
			}else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			x = sc.nextFloat();
			y = sc.nextFloat();
			
		}
		sc.close();
	}

}
