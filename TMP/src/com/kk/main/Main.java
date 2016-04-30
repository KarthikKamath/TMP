package com.kk.main;

import com.kk.hello.Hello;

public class Main {

	private final Hello hello;
	
	public Main() {
		
		hello = new Hello();
	}
	
	public void sayHellow() {
		hello.sayHello();
	}
	
	public static void main(String[] args) {

		new Main().sayHellow();
	}
}
