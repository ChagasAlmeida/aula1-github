package curso_progamacao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int item, quantidade;
		float valor;
		
		item = sc.nextInt();
		quantidade = sc.nextInt();
		
		/*  
		1 ---- Cachorro quente ---- R$ 4.00
	    2 ---- X-Salada ----------- R$ 4.50
	    3 ---- X-Bacon ------------ R$ 5.00
	    4 ---- Torrada Simples ---- R$ 2.00
	    5 ---- Refrigerante ------- R$ 1.50
		 */
		
		if (item == 1) {
			valor = quantidade * 4;
			System.out.printf("Total: R$ %.2f",valor);
			
		}else if (item == 2) {
			valor = (float) (quantidade * 4.50);
			System.out.printf("Total: R$ %.2f",valor);
			
		}else if (item == 3) {
			valor = quantidade * 5;
			System.out.printf("Total: R$ %.2f",valor);
			
		}else if (item == 4) {
			valor = quantidade * 2;
			System.out.printf("Total: R$ %.2f",valor);
			
		}else if (item == 5) {
			valor = (float) (quantidade * 1.50);
			System.out.printf("Total: R$ %.2f",valor);
			
		}
		
		sc.close();
	}

}
