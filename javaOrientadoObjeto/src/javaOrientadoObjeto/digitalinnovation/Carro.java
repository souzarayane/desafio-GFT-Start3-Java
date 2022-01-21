package javaOrientadoObjeto.digitalinnovation;

public class Carro {

	String cor;
	String modelo;
	double capTanque, valorGasolina;
	
	//Construtor
	Carro(){
		
	}
	
	Carro(String cor, String modelo, double capTanque, double valorGasolina){
		this.cor = cor;
		this.modelo = modelo;
		this.capTanque = capTanque;
		this.valorGasolina = valorGasolina;
	}
	
	//Getter's e Setter's
	public double getCapTanque() {
		return capTanque;
	}

	public void setCapTanque(double capTanque) {
		this.capTanque = capTanque;
	}

	public double getValorGasolina() {
		return valorGasolina;
	}

	public void setValorGasolina(double valorGasolina) {
		this.valorGasolina = valorGasolina;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Métodos
	double valorTotal(double valorGasolina) {
		return  capTanque * valorGasolina;
	}
}
