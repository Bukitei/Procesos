package Hilos;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escribe el número de veces que quieres que se repita;");
		
		n = in.nextInt();
		
		Fibonacci fib = new Fibonacci(n);
		
		fib.run();
		
		in.close();

	}

}
