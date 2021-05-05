

package PacoteExs;

import java.util.Scanner;

public class OrdemCresc {
	public static void main(String [] args) {
		
		int numero1,numero2,numero3;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.println("Entre com o numero 1:  ");
			numero1 = leia.nextInt();
			System.out.println("Entre com o numero 2:  ");
			numero2 = leia.nextInt();
			System.out.println("Entre com o numero 3:  ");
			numero3 = leia.nextInt();
				
				if((numero1<=numero2) && (numero1<=numero3)) {
					if (numero2<=numero3) {
						
						System.out.printf(" A ordem dos numero eh: %d,%d,%d",numero1,numero2,numero3);
					}
				}
					if((numero2<=numero1) && (numero2<=numero3)) {
						if (numero1<=numero3) {
							
							System.out.printf(" A ordem dos numero eh:%d,%d,%d ",numero2,numero1,numero3);
						}
				
	}
					if((numero3<=numero1) && (numero3<=numero2)) {
						if (numero1<=numero2) {
							
							System.out.printf(" A ordem dos numero eh: %d,%d,%d ",numero3,numero1,numero2);
						}
				
	}
}


}