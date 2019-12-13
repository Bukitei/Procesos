package Parking;

import java.util.concurrent.Semaphore;

public class Parking extends Semaphore {

	public Parking(int permits) {
		super(permits);
	}

}
