package sistemacontacorrente;

public class Gerente3 extends FuncionarioEspecial {
	int senha;

	double getBonus() {
		return super.getSalario()*0.05 + 5000;

	}

	//public boolean verifica(int senha) {
	//	if (this.senha == senha) {
	//		System.out.println("Acesso Autorizado");
	//		return true;
	//	} else {
	////		System.out.println("Acesso Negado");
	//		return false;
	//	}
		
		boolean verifica(String senha) {
			return false;
		}
	

}
