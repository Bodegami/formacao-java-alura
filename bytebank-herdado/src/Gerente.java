//Gerente herda da classe Funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticadorImpl autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticadorImpl();
	}
	
	public double getBonificacao() {
		double salary = super.getSalario();
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