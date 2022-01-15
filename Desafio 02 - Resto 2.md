<h1>Desafio 02 - Resto 2</h1>

Leia um valor inteiro **N**. Apresente todos os números entre 1 e 10000 que divididos por **N** dão resto igual a 2.

<h2>Entrada</h2>

A entrada contém um valor inteiro **N** (**N** < 10000).

<h2>Saída</h2>

Imprima todos valores que quando divididos por **N** dão resto = 2, um por linha.

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 13                 | 2 15 28 41 ...   |

<h2>Resposta</h2>

import java.io.IOException;
import java.util.Scanner;

public class DIO {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();
		
		for (int i = 1; i < 10000; i++) {
		  
			if (i % N == 2){ 
			  
			System.out.println(i);
		}
		
	}
//Complete com a sua lógica nos espaços em branco	
}

}