package PacoteExs;

import java.util.Scanner;

public class Maior {
			
	public static void main(String[] args) {
		
		int numero1,numero2,numero3,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o numero 1:  ");
		numero1 = leia.nextInt();
		System.out.println("Entre com o numero 2:  ");
		numero2 = leia.nextInt();
		System.out.println("Entre com o numero 3:  ");
		numero3 = leia.nextInt();
		
		
		if (numero1> maior) {
			
			maior = numero1;
		}
		
		if (numero2 > numero1) {
			
			maior = numero2;
		}
		
		if (numero3 > numero2) {
			
			maior = numero3;
			
		}
		
		
		
		System.out.println("\n O maior numero eh: "+maior);
		
	}
	
	
}
