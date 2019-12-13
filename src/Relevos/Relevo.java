package Relevos;

import java.util.concurrent.Semaphore;

public class Relevo {

	public static void main(String[] args) {

		Corredor[] corredores = new Corredor[4];
		
		 // Para que respete el orden
		Semaphore s = new Semaphore(1, true);
		for( int i = 0; i < 4; i++ ) {
			corredores[i] = new Corredor(s);
		}
		
		System.out.println("Todos los hilos creados");
		System.out.println("Doy la salida!");
		for( Corredor c : corredores ) {
			c.start();
		}
		
		for( Corredor c : corredores ) {
			try {
				c.join();
				
			} catch (InterruptedException e) {
				
			}
		}
		
		System.out.println("Terminé!");
		System.out.println("Todos los hilos terminados");

	}

}
