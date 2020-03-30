package curso_progamacao;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipo, somaAlcool = 0, somaGasolina = 0, somaDiesel = 0;
		
		tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				somaAlcool += 1;
			}else if (tipo == 2) {
				somaGasolina += 1;
			}else if (tipo == 3) {
				somaDiesel += 1;
			}tipo = sc.nextInt();
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Alcool: " + somaDiesel);
		
		sc.close();
	}

}
