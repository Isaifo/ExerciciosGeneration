
import java.util.Scanner;


public class While {
	public static void main(String [] args) {
		
		int x,idade,menor21=0,mais50=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O programa encerra quando o numero digitado for igual a -99!!\n");
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		
		while(idade != -99) {
			
			
			
			if(idade<21) {
				menor21= menor21 + 1;
			}
			
			if (idade>50) {
				mais50 = mais50 + 1;
			}
			
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("Pessoas menores de 21: %d",menor21);
		System.out.printf("\nPessoas maiores de 50: %d",mais50);
		
		
		
	}
}
