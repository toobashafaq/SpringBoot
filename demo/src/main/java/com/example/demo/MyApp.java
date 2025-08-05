package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class MyApp {
	private final MyComponent myComponent;

	public MyApp(MyComponent myComponent) {
		this.myComponent=myComponent;
	}
	public void run(){

		myComponent.getMessage();

	}
}
