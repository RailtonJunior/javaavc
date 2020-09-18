package sistemacontacorrente;

public class TestaConta4 {

	public static void main(String[] args) {
		Conta4 c1 = new Conta4("Railton", "12345");
		System.out.println("Nome do cliente: "+c1.cliente.nome);
		System.out.println("CPF do cliente: "+c1.cliente.cpf);
		int contador = c1.getContadorContas();
		System.out.println("Nosso banco possui " +contador+ " Conta");
		
		Conta4 c2 = new Conta4("Melo", "654321");
		System.out.println("Nome do cliente: "+c2.cliente.nome);
		System.out.println("CPF do cliente: "+c2.cliente.cpf);
		//contador = c2.getContadorContas();
		contador = Conta4.getContadorContas();
		System.out.println("Nosso possui banco " +contador+ " Contas");
		

	}

}
