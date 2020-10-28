package bibliotecas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {

	public static void main(String[] args) {
	try {	
		OutputStream os = new FileOutputStream("Escrita.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Test");
		bw.close();
		System.out.println("Escrita realizada com sucesso!!");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }	
}

