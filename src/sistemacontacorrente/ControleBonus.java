package sistemacontacorrente;

public class ControleBonus {
	private double totalBonus = 0;
	
	//classe abstrata pode ser refenciada
	
	public void setTotalBonus(Funcionario2 funcionario) {
		this.totalBonus += funcionario.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}

}
