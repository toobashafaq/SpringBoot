package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class MyComponent {


	public MyComponent() {
		System.out.println("MyComponent constructor");
	}
	public void getMessage(){
		System.out.println("Result from getmsg");
	}
}
