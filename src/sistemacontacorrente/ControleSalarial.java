package sistemacontacorrente;

public class ControleSalarial {
private double totalSalarios = 0;
	
	//Polimorfismo !!!
	//Aplicamos polimorfisco -> pode ter comportamentos diferentes
	//Resolvido em tempo de execução
	public void setTotalSalarios(Funcionario2 funcionario) {
		this.totalSalarios += funcionario.getSalario();
	}
	
	public double getTotalSalarios() {
		return this.totalSalarios;
	}


}
