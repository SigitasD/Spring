package com.sigitas.project;

import com.sigitas.project.models.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectApplication.class, args);

	}

}

