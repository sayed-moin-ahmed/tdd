package com.tdd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.function.Function;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello");
		YouTubeVideoLinkCreator youTubeVideoLinkCreator = new YouTubeVideoLinkCreator();
		URL url = youTubeVideoLinkCreator.createEmbeddedUrl("12345");
		System.out.println(url.toString());
		YouTubeLink  youTubeLink = new YouTubeLink("1234");
		youTubeLink.setYouTubeVideoLinkCreator(s -> {
			try {
				return new URL(s);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			return null;
		});


	}

}
