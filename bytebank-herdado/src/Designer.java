//Gerente herda da classe funcionario
public class Designer extends Funcionario{

	
	public double getBonificacao() {
		double salary = 200;
		System.out.println("Chamando o metodo de bonificacao do DESIGNER: " + salary);
		return salary;
	}

}