import java.util.Scanner;

public class FasesDaLua {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int inicio = entrada.nextInt();
        int fim = entrada.nextInt();
        
        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        } else if (inicio >= 3 && fim <= 96) {
            System.out.println("minguante"); //implemente o código aqui
        } else if (inicio >= 96 && fim <= 3 ) {
            System.out.println("crescente"); //implemente o código aqui
        } else { 
            System.out.println("cheia");  //implemente o código aqui
        }
    }

}

//entre 0 e 2 = lua nova
//entre 3 e 96 = lua crescente
//entre 97 e 100 = lua cheia
//entre 96 e 3 = lua minguante
	
	

