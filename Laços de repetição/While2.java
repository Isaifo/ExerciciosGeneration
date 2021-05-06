
import java.util.Scanner;

public class While2 {
		
		public static void main(String [] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int idade,sexo,x=1,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0;
		
			while(x<=3) {
			System.out.print("Insira sua idade: ");
			idade = leia.nextInt();
			
			System.out.print("\nInsira seu sexo: 1)FEMININO 2)MASCULINO 3)OUTROS");
			sexo = leia.nextInt();
			
			System.out.print("\nSituacao Psicológica: 1)Calma,2)Nervosa e Agressiva ");
			fp = leia.nextInt();
			
			
			if (fp==1) 
			{
				contpc++;
			}
				
			if(sexo==1 && fp==2) 
			{
				
				contmn++;
			}
			
			if(sexo==2 && fp==3) 
			{
				
				contha++;
			}
			
			if(sexo==3 && fp==1)
			{
				contoc++;
			}

			if(fp==2 && idade>40)
			{
				contpn40++;
			}
			if(fp==1 && idade<18)
			{
				contpc18++;
			}
			x++;
		}
			System.out.println("\nQuantidade de pessoas calmas: "+contpc);
			System.out.println("\nQuantidade de mulheres nervosas: "+contmn);
			System.out.println("\nQuantidade de homens agressivos: "+contha);
			System.out.println("\nQuantidade de outros calmas: "+contoc);
			System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: "+contpn40);
			System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: "+contpc18);
		}

		}

