package curso_progamacao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numFun, numHora;
		
		double valorHora, salario;
		
		numFun = sc.nextInt();
		numHora = sc.nextInt();
		
		valorHora = sc.nextDouble();
		
		salario = numHora*valorHora;
		
		System.out.printf("NUMBER = %d\n",numFun);
		System.out.printf("SALARY = U$ %.2f",salario);
		
		sc.close();
		
		

	}

}
