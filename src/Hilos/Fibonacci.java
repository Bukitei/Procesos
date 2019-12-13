package Hilos;

public class Fibonacci extends Thread {

	int first = 1;
	int second = 1;
	int change;
	int i;
	
	public Fibonacci(int n) {
		i = n;
		System.out.println("Sucesión de fibonacci:");
		run();
	}
	
	@Override
	public void run() {

		for(int j = 0; j <= i; j++) {
			if(first == 1) {
				System.out.println("Por defecto: 1");
			}else {
				System.out.println(first);
			}
			change = second;
			second = first + second;
			first = change;
		}
		
	}
	
	
	
}
