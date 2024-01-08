package org.example.three.naming;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class BeanNamingDemo {

    private static Logger logger = LoggerFactory.getLogger(BeanNamingDemo.class);

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(BeanNamingDemo.class);
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(beanName -> logger.debug(beanName));
    }
}

@Configuration
@ComponentScan
class BeanNamingCfg {

    @Bean
    public SimpleBean anotherSimpleBean() {
        return new SimpleBean();
    }
}

@Component
class SimpleBean {}
