package curso_progamacao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		float numero, teste;
		
		numero = sc.nextFloat();
		
		teste = numero % 2;
		
		if (teste == 0) {
			System.out.println("PAR");
			
		}else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
