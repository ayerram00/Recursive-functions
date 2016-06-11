
package com.sqa.ay;

public class Fibonacci {

	public static int fibonacci(int nTerm) {

		int first = 0, second = 1, third = 0;

		if (nTerm == 0) {
			return first;
		} else if (nTerm == 1) {
			return second;
		} else {

			while (nTerm > 1) {
				for (int i = 1; i < nTerm; i++) {
					third = second + first;
					first = second;
					second = third;

				}
			}
			return third;
		}

	}

}
