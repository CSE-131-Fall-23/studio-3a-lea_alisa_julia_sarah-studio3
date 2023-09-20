package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers would you like to test?");
		int n = in.nextInt();

		boolean[] sieve = new boolean[n];

		for (int i = 0; i < n; i++) {
			sieve[i] = false;
		}

		for (int a = 2; a < n; a++) {
			for (int b = 2; b < n; b++) {
				if ((a * b) < n) {
					sieve[a * b] = true;
				}
			}
		}
	
		for (int c=2; c<n; c++) {
			if (sieve[c]== false) {
				System.out.println(c);
			}
		}
	}

}
