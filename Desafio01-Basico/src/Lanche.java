import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		int X, Y;
		float preco = 0;
		
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		Y = input.nextInt();
		if (X == 1) {
			preco  = (float) (4.00 * Y);
		}else if (X == 2) {
			preco  = (float) (4.50 * Y);  //implemente sua l�gica aqui
		}else if (X == 3) {
			preco  = (float) (5.00 * Y);  //implemente sua l�gica aqui 
		}else if (X == 4) {
			preco  = (float) (2.00 * Y); //implemente sua l�gica aqui
		}else if (X == 5) {
			preco  = (float) (1.50 * Y); //implemente sua l�gica aqui
		}
		
		System.out.printf("Total: R$ %.2f\n",preco);
	}

}
