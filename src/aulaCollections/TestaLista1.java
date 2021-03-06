package aulaCollections;

import java.util.ArrayList;
import java.util.List;

import sistemacontacorrente.Conta;
import sistemacontacorrente.Lista;

public class TestaLista1 {

	public static void main(String[] args) {
		List lista1 = new ArrayList();
		lista1.add("Alex");
		lista1.add("Brenno");
		lista1.add("Caio");
		lista1.add("Iuri");
		System.out.println(lista1);
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		c1.depositar(10);
		c1.setNome("Alex");
		c2.depositar(20);
		c2.setNome("Brenno");
		c3.depositar(30);
		c3.setNome("Caio");
		List contas = ArrayList();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		System.out.println(contas);
		System.out.println(contas.size());
		
		for (int i = 0; i < contas.size(); i++) {
			Conta cTemp = (Conta) contas.get(i);
			System.out.println(cTemp.getNome());
			System.out.println(cTemp.getSaldo());
		}
		
		  List<Conta> contas2 = new ArrayList<Conta>();
	        contas2.add(c1);
	        contas2.add(c2);
	        System.out.println(contas2.size());

		
	        for (Conta conta: contas2) {            //For Each
	            System.out.println(conta.getNome());
	            System.out.println(conta.getSaldo());
	        }


	}

	
}
