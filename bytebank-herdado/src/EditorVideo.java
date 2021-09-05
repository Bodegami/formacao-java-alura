//Gerente herda da classe funcionario
public class EditorVideo extends Funcionario{

	
	public double getBonificacao() {
		double salary = super.getBonificacao() + 100;
		System.out.println("Chamando o metodo de bonificacao do EDITOR DE VIDEO: " + salary);
		return salary;
	}

}