package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerChaTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in;
		//InputStream é a classe Java q sabe capturar um byte
		//nesse caso recebendo da entrada padrão do sistema
		InputStreamReader isr = new InputStreamReader(is);
		//InputStreamReader sabe receber um byte e trnsforma-lo em char
		char c = 0;
		try { 
			c = (char) isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Voce digitou a tecla: "+c);

	}

}
