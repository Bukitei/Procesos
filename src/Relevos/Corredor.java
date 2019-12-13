package Relevos;

import java.util.concurrent.Semaphore;

public class Corredor extends Thread {
	
	// Reocgemos el semáforo
	Semaphore semaphore;
	
	public Corredor(Semaphore s) {
		this.semaphore = s;
	}
	
	public void run() {
		
		// Ahora esperams al relevo
		try {
			
			semaphore.acquire();
			System.out.printf("Soy un corredor, corriendo....\n");
			Thread.sleep(500);
			semaphore.release();
			
		} catch(InterruptedException e ) {
		
		}
		

		System.out.printf("Acabé, paso el testigo al siguiente\n");
	
		
	}

}
