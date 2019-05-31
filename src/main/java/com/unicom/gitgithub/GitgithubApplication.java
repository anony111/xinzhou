package com.unicom.gitgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GitgithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitgithubApplication.class, args);
    }

}
