package curso_progamacao;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, i, impar = 1;
		
		numero = sc.nextInt();
		
		for (i = 0; i < Math.round(numero/2.0); i += 1) {
			System.out.println(impar); 
			impar += 2; 
			 
		}
		sc.close();
	} 
}
