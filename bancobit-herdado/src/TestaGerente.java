
public class TestaGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente marco = new Gerente();
		marco.setNome("Nico");
		marco.setCpf("222333444-5");
		marco.setSalario(5000.0);

		System.out.println(marco.getNome());
		System.out.println(marco.getCpf());
		System.out.println(marco.getSalario());

		marco.setSenha(2222);
		boolean autenticou = marco.autentica(2222);

	}
}
