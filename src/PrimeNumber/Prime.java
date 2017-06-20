package PrimeNumber;

/**
 * that checks whether a given number is a prime using both the Thread class and
 * Runnable interface
 * 
 * @author Hp
 *
 */

class Prime implements Runnable { // Runnable interface

	public void run() {
		int n;
		System.out.println("Prime numbers from 1 to 10 are ");
		for (n = 2; n <= 10; n++) { // For Loop
			int temp = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (n % 2 == 0) { // If statement
					temp++;
					break; // Break statement it comes out from the loop
				}
			}

			if (temp == 0) {
				System.out.println(n);
			}
		}

	}

	public static void main(String[] args) {
		try { // Try statement if any exception occurs
			Prime p = new Prime(); // creating object of Prime class
			Thread t = new Thread(p); // starting the thread
			t.start(); 
		} catch (Exception e) { // Catch statement to handle the exception
		}

	}

}
