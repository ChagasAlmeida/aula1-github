package curso_progamacao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double renda, imposto = 0;
		
		/* |Renda                       | Imposto de Renda |
		 * -------------------------------------------------
		 * |de 0.00 a R$ 2000.00        |      Isento      |
		 * |de R$ 2000.01 até R$ 3000.00|        8%        |
		 * |de R$ 3000.01 até R$ 4500.00|        18%       |
		 * |acima de R$ 4500.00         |        28%       |
		 */
		
		renda = sc.nextFloat();
		
		if (renda > 0 && renda <= 2000) {
			System.out.println("Isento");
			
		}if (renda > 2000) {
           
		   if (renda <= 3000) {
			   imposto = (renda-2000)*0.08; 	   
		   }else {
			   imposto = 1000*0.08;
		   }
		   
		}if (renda > 3000) {
		  
		   if (renda <= 4500) {
			   imposto = imposto + (renda - 3000)*0.18;
		   }else {
			   imposto = imposto + 1500*0.18;
		   }
			
		}if (renda > 4500) {
		   imposto = imposto + (renda - 4500)*0.28;
			
		}if (renda > 2000) {
			System.out.printf("R$ %.2f", imposto);
			
		}
			sc.close();
	}

}
