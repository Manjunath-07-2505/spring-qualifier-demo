package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FifthqualifierannotaionApplication {

	public static void main(String[] args) {
		ApplicationContext st = SpringApplication.run(FifthqualifierannotaionApplication.class, args);
		student ss = st.getBean(student.class);
		ss.study();
		ss.workingwithother();
	}

}
