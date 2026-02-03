package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class laptop implements ElectronicDevice{
	public void useDevice() {
		System.out.println("laptop is getting used");
	}
}
