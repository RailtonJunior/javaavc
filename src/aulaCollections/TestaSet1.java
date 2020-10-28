package aulaCollections;

import java.util.HashSet;
import java.util.Set;

public class TestaSet1 {

	public static void main(String[] args) {
		Set objetos = new HashSet();
		objetos.add("objetos1");
		objetos.add("objetos2");
		objetos.add("objetos3");
		objetos.add("objetos2");
		objetos.add("objetos1");
		System.out.println(objetos+"\n");
		System.out.println(objetos.size());
		
		for (Object object : objetos) {
			System.out.println(object);
						
		}

	}

}
