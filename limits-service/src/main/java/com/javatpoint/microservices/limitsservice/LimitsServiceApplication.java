package com.javatpoint.microservices.limitsservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigurationProperties
@ComponentScan("com.javatpoint.microservices.limitsservice")
@EnableDiscoveryClient
@SpringBootApplication
public class LimitsServiceApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(LimitsServiceApplication.class, args);
}
}
