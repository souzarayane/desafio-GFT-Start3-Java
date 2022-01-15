package desafioDIO.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número inteiro");
		int N = entrada.nextInt();
		for(int i = 1; i < 10000; i++) {
			if(i % N == 2) {
			System.out.println(i);
			}

		entrada.close();

		}

	}
}