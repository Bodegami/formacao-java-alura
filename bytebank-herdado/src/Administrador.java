//Aministrador herda da classe Funcionario, assina contrato Autenticavel
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticadorImpl autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticadorImpl();
	}
	
	@Override
	public double getBonificacao() {
		double salary = 50.0;
		System.out.println("Chamando o metodo de bonificacao do GERENTE: " + salary);
		return salary;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}