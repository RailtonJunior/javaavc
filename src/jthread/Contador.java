package jthread;

public class Contador implements Runnable {
	private int cont;
	
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	//public void contar() {
	//public void run() {
	public synchronized void run() { // synchronized serve para sicronizar a execução	
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread " +cont+", valor: "+i);
		}
	}

}


//Escalonador de Thread Cada vez que ele troca de thread,
//faz uma operação chamada "troca de contexto"
