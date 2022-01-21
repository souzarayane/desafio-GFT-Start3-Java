package javaOrientadoObjeto.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setCor("Azul");
		carro1.setModelo("Fusca");
		carro1.setCapTanque(50);

		System.out.println(carro1.getCor());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCapTanque());
		double valorGasolina = 8.10;
		System.out.println(carro1.valorTotal(valorGasolina * 0.50));
		
	}

}
