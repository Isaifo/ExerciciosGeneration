
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		//setando os parametros
		
		func.setNome("Fernanda");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		
	}
}
