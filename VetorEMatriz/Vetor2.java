import java.util.Scanner;


public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		int[] vetor = new int[6];
		int i,par,somapar=0,qtdimpar=0,somaimpar=0;
		
			for(i=0;i<6;i++) {
				
				System.out.println("Informe valor: ");
				vetor[i] = leia.nextInt();			
				
				if(vetor[i] % 2 == 0 ) {
			 		
					System.out.println(vetor[i]+" É um numero Par");
					
			 		somapar = somapar + vetor[i];
			 	}
				 	else {
				 		System.out.println(vetor[i]+" É um numero Impar");
				 		qtdimpar++;
				 	}
			}
			
			
			System.out.println("\nSomatorio dos pares: "+somapar);
			System.out.println("\nQuantidade de impares: "+qtdimpar);
			
			
	}
}
