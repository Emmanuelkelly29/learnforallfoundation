package org.learnforallfoundation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class LearnForAllFoundationApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnForAllFoundationApplication.class, args);
    }

}
