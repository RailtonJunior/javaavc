package excessoes;

import java.io.FileNotFoundException;

public class TesteException2 {

	public static void main(String[] args) {
		try {
			new java.io.FileReader("arquivoDeTeste.txt");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		//} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
