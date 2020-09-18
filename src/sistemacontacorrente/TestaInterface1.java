package sistemacontacorrente;

public class TestaInterface1 {
	public static void main(String[] args) {
		String senha = "abc123";
		AcessoInterno f1 = new Gerente4();
		boolean teste = f1.verifica(senha);
		if (teste) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Login errado");
		}
	}

}
