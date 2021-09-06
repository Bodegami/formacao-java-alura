//Gerente herda da classe Funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		double salary = super.getSalario();
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