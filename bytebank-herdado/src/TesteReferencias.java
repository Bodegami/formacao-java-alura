
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Paulo");
//		f1.setSalario(2000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setNome("Ana");
		ev.setSalario(2500.0);
		
		Funcionario d = new Designer();
		d.setNome("Lucia");
		d.setSalario(2000.0);
				
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
//		controle.registra(f1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
		
		
	}
}
