
import java.util.Scanner;

public class For2 {
			
	
	public static void main(String[] args)
	{	
	
	
	int x,numero=0,par=0,impar=0;
	
	Scanner leia = new Scanner(System.in);
	
	
	
	for(x=0;x<10;x++) {
		
		System.out.println("\nInsira numero:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			
			par = par + 1;
		}
		
		else {
			
			impar = impar + 1;
		}
		
	}
	
	System.out.println("\nQuantidade de pares:  "+par);
	System.out.println("\nQuantidade de impares:  "+impar);
	
}
}