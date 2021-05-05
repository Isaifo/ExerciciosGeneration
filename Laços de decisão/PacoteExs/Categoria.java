package PacoteExs;

import java.util.Scanner;

public class Categoria {

		public static void main(String[] args) {
			
			int idade=0;
			
			Scanner leia = new Scanner(System.in);
			
				System.out.println("Insira sua idade: ");
				idade = leia.nextInt();
					
					if(idade>=10 && idade<=14) {
						
						System.out.println("Voce se encontra na categoria INFANTIL! ");
					}
			
						if(idade>=15 && idade<=17) {
						
						System.out.println("Voce se encontra na categoria JUVENIL! ");
					}
					
						
						if(idade>=18 && idade<=25) {
							
							System.out.println("Voce se encontra na categoria ADULTO! ");
						}
						
							
			
		}
}
