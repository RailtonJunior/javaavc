package sistemacontacorrente;

public class TestaPolimorfismoControleBonus {
	public static void main (String[] args) {
		ControleBonus controle = new ControleBonus();
		
		Funcionario2 f2 = new Funcionario2();
		f2.salario(1000);
		controle.setTotalBonus(f2);
		System.out.println(controle.getTotalBonus());
		
		Funcionario2 g3 = new Gerente();
		g3.setSalario(100000);
		controle.setTotalBonus(g3);
		System.out.println(controle.getTotalBonus());
	}

}
