package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class student {
	ElectronicDevice ref;
	void study() {
		System.out.println("i'm studying know...");
	}
	
	void workingwithother() {
		ref.useDevice();
	}

	public student(@Qualifier("mob") ElectronicDevice ref) {
		super();
		this.ref = ref;
	}
	
}
