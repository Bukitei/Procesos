package Hilos;

public class Tic extends Thread {

	
	@Override
	public void run() {
		
			try {
				System.out.println("TIC");
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
}
