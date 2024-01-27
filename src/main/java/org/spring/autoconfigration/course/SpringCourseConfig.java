package org.spring.autoconfigration.course;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class SpringCourseConfig {
   // @ConditionalOnBean(name = "college")
    @Bean
    public SpringCourse springCourse(){
        return new SpringCourse();
    }
    @Bean
    public AuthorName authorName(){
        return new AuthorName();
    }
}
