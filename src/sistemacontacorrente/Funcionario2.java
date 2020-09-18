package sistemacontacorrente;

abstract class Funcionario2 {
	private String nome;
	private String cpf;
	private String departamento;
	private String dataAdmissao;
	private double salario;
	private String status;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	//bonificação passou de fica para pencentual do salário
	//double getBonus() {//5% do salário
	//	return this.salario * 0.05;
	//}
	
	//Toda classe com método abstrato tem que ser abstrata
	//mas, nem toda Classe Abstrata, tem métodos abstratos
	abstract double getBonus();
	
	//a consequência de uma classe ser abstrata é que
	//ela não pode ser instanciada -> vide TestaGerente2
	//mas pode ser referenciada -> Vide ControleBonus
			//a consequencia de um metodo ser abstrato eh que
			//todos que herdarem da classe abstrata são obrigados
			//a implementar o metodo abstrato
	}