package br.com.acalapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import retrofit2.Retrofit;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public Retrofit retrofit() {
		return new Retrofit.Builder()
			.baseUrl("http:localhost:8080")
			.build();
	}
}
