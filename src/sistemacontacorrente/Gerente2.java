package sistemacontacorrente;

public class Gerente2 extends Funcionario2 {
	int senha;

	double getBonus() {
		return this.salario * 0.15;

	}

	public boolean verifica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Autorizado");
			return true;
		} else {
			System.out.println("Acesso Negado");
			return false;
		}
	}

}
