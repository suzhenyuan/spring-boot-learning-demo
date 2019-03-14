package org.spring.action.demo;

import org.spring.action.demo.controllers.DemoController;
import org.spring.action.demo.soundsystem.PlaySoundConfig;
import org.spring.action.demo.validate.validateConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses={DemoController.class,PlaySoundConfig.class,validateConfig.class})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
