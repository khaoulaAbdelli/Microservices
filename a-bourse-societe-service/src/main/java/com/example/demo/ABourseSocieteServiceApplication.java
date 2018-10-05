package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.SocieteRepository;
import com.example.demo.entities.Societe;

@SpringBootApplication
public class ABourseSocieteServiceApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(ABourseSocieteServiceApplication.class, args);
		SocieteRepository societeRepository  = ctx.getBean(SocieteRepository.class) ;
		Stream.of("A","B","C").forEach(s->societeRepository.save(new Societe(s)));
		societeRepository.findAll().forEach(s->System.out.println(s.getNameSociete()));
	}
}
