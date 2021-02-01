package com.nobelsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class KubernetesExampleApplication {

    public static void main(String[] args) {
        System.out.println("Prueba");
        SpringApplication.run(KubernetesExampleApplication.class, args);
    }
}
