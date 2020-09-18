package sistemacontacorrente;

public class TesteGerente {

	public static void main(String[] args) {
		//classe abstrata n pode ser instanciada...
	
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(1000);
		double salFunc = f2.getSalario();
		System.out.println("Salario Funcionario: " +salFunc);
		double bonusFunc = f2.getBonus();
		System.out.println("Bonificação: " +bonusFunc);
		
		
		Gerente2 g2 = new Gerente2();
		g2.setSalario(10000);
		double salGer = g2.getSalario();
		System.out.println("Salario Gerente: " +salGer);
		double bonusGer = g2.getBonus();
		System.out.println("Bonificação: " +bonusGer);
	}

}
