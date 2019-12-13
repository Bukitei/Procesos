package Hilos;

public class Tac extends Thread {

	@Override
	public void run() {
		
			try {
				System.out.println("TAC");
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
