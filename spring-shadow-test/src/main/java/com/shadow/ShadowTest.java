package com.shadow;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShadowTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(IndexService.class));
	}
}

