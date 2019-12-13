package Parking;

import java.util.concurrent.Semaphore;

public class Entrada extends Semaphore {
	
	public Entrada(int permits) {
		super(permits);
	}

}
