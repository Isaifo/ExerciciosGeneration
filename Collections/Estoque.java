
import java.util.ArrayList;
import java.util.Scanner;


public class Estoque {

	public static void main(String[] args) {
		
		
int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
	
		do
		{
			System.out.println("\n-----------MENU DE OPÇÕES DO ESTOQUE--------------------");
			System.out.println("\n(1) Para adicionar novos produtos!!");
			System.out.println("\n(2) Para remover produtos do estoque!!");
			System.out.println("\n(3) Para atualizar os produtos do estoque!!");
			System.out.println("\n(4) Para mostrar todos os produtos do estoque!!");
			System.out.println("\n(0) Para encerrar o programa");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nProduto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nProduto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseje atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque!!!");
				}
				break;
			case 4:
				System.out.println("\nProdutos do estoque:");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nPrograma finalizado!");
				
			}
		}while(op!=0);
	}



		
		
		
		
		
		
	}
	
	


