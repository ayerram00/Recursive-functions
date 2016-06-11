package com.sqa.ay;

import org.testng.annotations.*;

public class FibonacciTest {
	@Test
	public void f() {
		// Fibonacci nfibo = new Fibonacci();
		int a = Fibonacci.fibonacci(8);
		System.out.println(a);
	}
}
