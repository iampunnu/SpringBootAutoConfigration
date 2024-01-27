package org.spring.autoconfigration;

import org.spring.autoconfigration.course.SpringCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoConfigrationApplication implements CommandLineRunner {
    @Autowired
    SpringCourse springCourse;

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigrationApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        springCourse.setName("pr");
        springCourse.getAuthorName().setAuthName("auth");
        springCourse.getAuthorName().setAg(12);
        System.out.println(springCourse.getName()+" "+springCourse.getAuthorName().authName+" "+springCourse.getAuthorName().getAg());

    }
}
