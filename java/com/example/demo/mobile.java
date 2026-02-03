package com.example.demo;

import org.springframework.stereotype.Component;

@Component("mob")
public class mobile implements ElectronicDevice{
	public void useDevice() {
		System.out.println("mobile is getting used...");
	}
}
