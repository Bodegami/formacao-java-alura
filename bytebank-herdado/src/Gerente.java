//Gerente herda da classe funcionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel{
	
	
	public double getBonificacao() {
		double salary = super.getSalario();
		System.out.println("Chamando o metodo de bonificacao do GERENTE: " + salary);
		return salary;
	}

}