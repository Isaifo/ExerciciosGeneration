
public class Cavalo extends Animal {

	private String deveCorrer;
	
	
	public Cavalo (String nome, int idade, String emiteSom, String deveCorrer ) {
		
		
		super(nome,idade,emiteSom);
			
			this.deveCorrer = deveCorrer;
		}


	public String getDeveCorrer() {
		return deveCorrer;
	}


	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
		
}
