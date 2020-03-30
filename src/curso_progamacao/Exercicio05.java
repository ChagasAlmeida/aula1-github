package curso_progamacao;

import java.util.Scanner;


public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String codigo1;
		int numPecas1;
		double valorPecas1;
		
		codigo1 = sc.next();
		numPecas1 = sc.nextInt();
		valorPecas1 = sc.nextDouble();
		
		String codigo2;
		int numPecas2;
		double valorPecas2;
		
		codigo2 = sc.next();
		numPecas2 = sc.nextInt();
		valorPecas2 = sc.nextDouble();
		
		double valor = (numPecas1*valorPecas1) + (numPecas2*valorPecas2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",valor);
		
		sc.close();
		
		

	}

}
