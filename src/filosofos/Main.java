package filosofos;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		Filosofos[] filosofos = new Filosofos[5];
		Palillos[] palillos = new Palillos[5];
		
		for(int i = 0; i < 5; i++) {
			palillos[i] = new Palillos(1);
		}
		for(int i = 0; i < 5; i++) {
			if(i != 4) {
				filosofos[i] = new Filosofos(palillos[i], palillos[i+1], i+1);
			}else {
				filosofos[i] = new Filosofos(palillos[i], palillos[0], i+1);
			}
		}
		
		System.out.println("Todos los filósofos y palillos creados");
		System.out.println("Comenzando la cena");
		
		for(Filosofos f : filosofos) {
			f.start();
		}
	}
	
	
}
