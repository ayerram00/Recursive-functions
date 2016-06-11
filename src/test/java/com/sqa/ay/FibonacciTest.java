package com.sqa.ay;

import org.testng.annotations.*;

public class FibonacciTest {
	@Test
	public void f() {
		Fibonacci nfibo = new Fibonacci();
		int a = nfibo.fibonacci(4);
		System.out.println(a);
	}
}
