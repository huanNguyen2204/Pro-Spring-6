package org.example.three.explicit;

import org.example.three.naming.BeanNamingDemo;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.SimpleBeanInfo;
import java.util.Arrays;
import java.util.logging.Logger;

public class ExplicitBeanNamingDemo {

    private static Logger logger = LoggerFactory.getLogger(ExplicitBeanNamingDemo.class);

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(BeanNamingDemo.class);

        var simpleBeans = ctx.getBeansOfType(SimpleBean.class);
        simpleBeans.forEach((k, v) -> {
            var aliases = ctx.getAliases(k);
            if (aliases.length > 0) {
                logger.debug("Aliases for {}", k);
                Arrays.stream(aliases).forEach(a -> logger.debug("\t {}", a));
            }
        });
    }
}

@Configuration
@ComponentScan
class BeanNamingCfg {

    @Bean("simpleBeanTwo")
    public SimpleBean simpleBean2() {
        return new SimpleBean();
    }

    @Bean({"simpleBeanTree", "three", "numero_tres"})
    public SimpleBean simpleBean3() {
        return new SimpleBean();
    }
}