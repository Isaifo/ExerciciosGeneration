
public class Preguica extends Animal{
	
private String sobeEmArvores;
	
	
	public Preguica (String nome, int idade, String emiteSom, String sobeEmArvores ) {
		
		
		super(nome,idade,emiteSom);
			
			this.sobeEmArvores = sobeEmArvores;
		}


	public String getSobeEmArvores() {
		return sobeEmArvores;
	}


	public void setSobeEmArvores(String sobeEmArvores) {
		this.sobeEmArvores = sobeEmArvores;
	}




}
