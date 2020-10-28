package sistemacontacorrente;

import sistemacontacorrente.Conta;
import java.util.ArrayList;
import java.util.List;

public class TestaLista1 {
	public static void main(String[] args) {
		List lista1 = new ArrayList();
		lista1.add("Alex");
		lista1.add("brenno");
		lista1.add("Caio");
		lista1.add("Iuri");
		System.out.println(lista1);
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		c1.depositar(10);
		c1.setNome("Alex");
		c2.depositar(20);
		c2.setNome("brenno");
		c3.depositar(30);
		c3.setNome("Caio");
		Lista contas = ArrayList();
		conta.add(c1);
		conta.add(c2);
		conta.add(c3);
		System.out.println(contas);
		System.out.println(contas.size());
		
		for (int i = 0; i < contas.size(); i++) {
			Conta cTemp = (Conta) contas.get(i);
			System.out.println(cTemp.getNome());
			System.out.println(cTemp.getSaldo());
		}
	}


}
