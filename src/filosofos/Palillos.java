package filosofos;

import java.util.concurrent.Semaphore;

@SuppressWarnings("serial")
public class Palillos extends Semaphore{

	public Palillos(int permits) {
		super(permits);
		
	}

}
