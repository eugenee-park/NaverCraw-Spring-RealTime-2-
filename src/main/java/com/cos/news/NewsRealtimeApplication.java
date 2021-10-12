package com.cos.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class NewsRealtimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsRealtimeApplication.class, args);
	}

}
