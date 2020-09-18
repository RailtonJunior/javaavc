package excessoes;

public class TestException {
	public static void main(String[] args) {
		System.out.println("Inicio do metodo main");
		metodo1();
		System.out.println("Fim do metodo main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo 2");
		int array[];
		try {
		array = new int[10];
		for (int i = 0; i < 20; i++) {
			array[i] = i;
			System.out.println(i);
			
			}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("erro pego (catched): " +e);
		}
		
		System.out.println("Fim do metodo 2");
		
	}

}
