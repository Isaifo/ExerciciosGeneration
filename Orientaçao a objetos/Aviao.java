
public class Aviao {

	
	private String modeloAviao;
	private String companhiaAviao;
	
	public Aviao(String modelo,String companhia)
	{
		modeloAviao = modelo;
		companhiaAviao = companhia;
		
		
	}
	
	//
	public String getInfoCompleta() 
	
	{
			String infoCompleta = modeloAviao+" "+companhiaAviao;
			return infoCompleta;
	}
}
