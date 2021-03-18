package com.sreenivaasamu.demoz.sfcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Launcher {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Launcher.class);
		//app.setBannerMode(Mode.OFF); // Disable banner
		app.run(args);
	}

}
