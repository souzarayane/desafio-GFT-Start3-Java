package polimorfismo;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Mae[] classes = new Mae[] {new Filha1(), new Filha2(), new Mae()};
		
	for(Mae classe: classes) {
		classe.metodo1();
	}
	
	System.out.println("");
	
	for(Mae classe: classes) {
		classe.metodo2();
	}
	
	System.out.println("");
	
	Filha2 classeFilha2 = new Filha2();
	classeFilha2.metodo2();
		
	}
}
