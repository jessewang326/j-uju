package net.dataoriented.juju.onipuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnipUserApplication {
    public static void main(String[] args) {

        SpringApplication.run(OnipUserApplication.class, args);
    }
}



