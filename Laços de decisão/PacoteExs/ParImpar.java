package PacoteExs;

import java.util.Scanner;


public class ParImpar {

			public static void main(String[] args) {
				
				int numero;
				double resultado;
				
				Scanner leia = new Scanner(System.in);
				
					 System.out.println("Insira um numero: ");
					 numero = leia.nextInt();
					 
					 	if(numero % 2 == 0 ) {
					 		
					 		System.out.println("Numero PAR ");
					 		resultado = Math.sqrt(numero); // sqr é a raiz
					 	}
						 	else {
						 		System.out.println("Numero IMPAR ");
						 		resultado = Math.pow(numero, 2);
						 	}
						 	
					 			System.out.println("\nResultado: %.2lf"+resultado);
			}
}
