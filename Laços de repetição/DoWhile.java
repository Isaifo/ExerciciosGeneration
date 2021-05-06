
import java.util.Scanner;

public class DoWhile {
				
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero,soma=0;
		
		do {
			System.out.println("Insira o numero:");
			numero = leia.nextInt();
			
			soma = soma + numero;
			
		}while(numero != 0);
		
		
		System.out.println("A soma dos numeros digitados eh:"+soma);
	}
}
