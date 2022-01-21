package desafioDIO.exercicios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD =  A * B  ; 
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
		
	}
	
}
