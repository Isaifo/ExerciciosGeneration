
import java.util.Scanner;


public class DoWhile2 {
			public static void main(String [] args) {
				
				Scanner leia = new Scanner(System.in);
				
				int ,i=0,qtde=0,multiplo;
				float media=0,numero;
				
				do {
					
		            System.out.println("Numero: ");
		            numero = leia.nextInt();
		            
		          multiplo = numero/3 % i;
		            	
		            if(i == 0) {
		            	 qtde = qtde + 1;
		            	media = (media + numero) / qtde;
		            }
		            
				}while(numero !=0);
				
				System.out.println("Numeros divisiveis por 3:  "+qtde);
				System.out.println("A media deles eh de:  "+media);
}
}