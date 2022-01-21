package interfaceJava;

public abstract class Calculadora implements OperacaoMatematica{

	public static void main(String[] args) {
		
		@Override
		public void soma(int num1, int num2) {
			System.out.println("Soma: " + (num1 + num2));
		}
		
		@Override
		public void subtracao(int num1, int num2) {
			System.out.println("Subtra��o: " + (num1 - num2));
		}
		
		@Override
		public void multiplicacao(int num1, int num2) {
			System.out.println("Multiplica��o: " + (num1 * num2));
		}
		
		@Override
		public void divisao(int num1, int num2) {
			System.out.println("Divis�o: " + (num1 / num2));
		}

	}

}
