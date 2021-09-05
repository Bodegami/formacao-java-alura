
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("25469852482");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		
		g1.setSenha(12345);
		boolean autenticou = g1.autentica(12345);
		
		System.out.println(autenticou);
		
		
	}

}
