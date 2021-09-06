//Aministrador herda da classe Funcionario, assina contrato Autenticavel
public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public double getBonificacao() {
		double salary = 50.0;
		System.out.println("Chamando o metodo de bonificacao do GERENTE: " + salary);
		return salary;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}