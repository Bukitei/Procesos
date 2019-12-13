package productorconsumidor;

public class Cola {
	private int numero;
	private boolean disponible = false;// inicialmente cola vacia

	public synchronized int get() {
		while (disponible == false) { // hay número en la cola
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		disponible = false;
		notifyAll();
		return numero;
	}

	public synchronized void put(int valor) {
		while (disponible == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		numero = valor; // coloca valor en la cola
		disponible = true; // disponible para consumir, cola llena
		notifyAll();
	}
}
