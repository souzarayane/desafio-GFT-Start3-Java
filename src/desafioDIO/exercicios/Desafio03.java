package desafioDIO.exercicios;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int L = entrada.nextInt();
		int C = entrada.nextInt();

		if(L % 2 == 1 && C % 2 == 0) {
			System.out.println("0");
		}else if(L % 2 == 0 && C % 2 == 1){
			System.out.println("0");
		}else {
			System.out.println("1");
		}
		entrada.close();

	}

}
