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
	
	//bonifica��o passou de fica para pencentual do sal�rio
	//double getBonus() {//5% do sal�rio
	//	return this.salario * 0.05;
	//}
	
	//Toda classe com m�todo abstrato tem que ser abstrata
	//mas, nem toda Classe Abstrata, tem m�todos abstratos
	abstract double getBonus();
	
	//a consequ�ncia de uma classe ser abstrata � que
	//ela n�o pode ser instanciada -> vide TestaGerente2
	//mas pode ser referenciada -> Vide ControleBonus
			//a consequencia de um metodo ser abstrato eh que
			//todos que herdarem da classe abstrata s�o obrigados
			//a implementar o metodo abstrato
	}