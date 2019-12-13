package filosofos;


public class Filosofos extends Thread{
	
	Palillos him;
	Palillos other;
	int id;
	
	public Filosofos(Palillos Sa, Palillos Sb, int id) {
		this.him = Sa;
		this.other = Sb;
		this.id = id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			
			try {
				System.out.println("Filósofo "+id+" pensando");
				Thread.sleep((long) (Math.random()*600+100));
				System.out.println("Filósofo "+id+" quiere comer");
				him.acquire();
				other.acquire();
				System.out.println("Filósofo "+id+" comiendo");
				Thread.sleep((long) (Math.random()*1000+300));
				him.release();
				other.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

	
	
}
