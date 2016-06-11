
package com.sqa.ay;

public class Fibonacci {

	static int first = 0, second = 1, current = 0;

	public static int fibonacci(int nTerm) {

		if (nTerm == 0) {
			return first;
		} else if (nTerm == 1) {
			return second;
		} else {

			// while (nTerm > 1) {
			// for (int i = 1; i < nTerm; i++) {
			// current = second + first;
			// first = second;
			// second = current;
			//
			// }
			// }
			return (fibonacci(nTerm - 2) + fibonacci(nTerm - 1));
		}

	}

}
