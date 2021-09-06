//Gerente herda da classe funcionarioAutenticavel
public class Administrador extends FuncionarioAutenticavel {
	
	@Override
	public double getBonificacao() {
		double salary = 50.0;
		System.out.println("Chamando o metodo de bonificacao do GERENTE: " + salary);
		return salary;
	}

}