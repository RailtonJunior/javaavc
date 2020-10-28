package bibliotecas;

import java.lang.Math;

public class TestaBibliotecas {

	public static void main(String[] args) {
		
		double n1 = 28;
		double n2 = 4;
		
		// random() a cada funcionamento gera valor diferente "aleatorio"
		System.out.println("Numero aleatorio: " +Math.random()*n2);
		
		// max() Mostrar qual o valor maior
		System.out.println("numero maximo: " +Math.max(n1, n2));
		
		//min() Mostrar o valor menor
		System.out.println("numero menor: " +Math.min(n1, n2));
		
		//ceil() retorna o valor double maior e mais próximo de a (“arredonda pra cima”).
		System.out.println("Um valor redondo (arredonda pra cima):  " +Math.ceil(n2));
		
		//floor()  retorna o valor double menor e mais próximo de a (“arredonda pra baixo”).
		System.out.println("Um valor redondo (arredonda pra cima):  " +Math.floor(n2));
		
		//exp()  Retorna o número de Euler elevado à potência de um valor duplo.
		System.out.println("Numero Elevado de Euler: "+Math.exp(n1));
		
		//log()  retorna o logaritmo natural.
		System.out.println("Logaritimo: " +Math.log(n1));
			
		//pow() retorna o valor n1 elevado à potência n2.
		System.out.println("Valor da potencia é: " +Math.pow(n1, n2));
		
		//sqrt()  retorna a raiz quadrada
		System.out.println("Raiz quadrada: " +Math.sqrt(n2));
		
		//sin() seno de um ângulo (em radianos).
		System.out.println("Seno de um angulo: " +Math.sin(n1));
		
		//toDegrees()  converte um ângulo dado em radianos para seu equivalente em graus.
		System.out.println("Convertendo angulo dado em radiano: " +Math.toDegrees(n2));
		
		//toRadians() converte um ângulo dado em graus para seu equivalente em radianos.
		System.out.println("Convertendo angulo dado em graus: " +Math.toRadians(n2));


	}

}
