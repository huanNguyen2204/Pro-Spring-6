package org.example.three.scope;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class NonSingletonDemo {

    private static Logger logger = LoggerFactory.getLogger(BeanNameGerneratorDemo.class);

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Singer.class);
        ctx.refresh();

        var singer1 = ctx.getBean("nonSingleton", Singer.class);
        var singer2 = ctx.getBean("nonSingleton", Singer.class);

        logger.info("Identify Equal?: " + (singer1 == singer2));
        logger.info("Value Equals: " + singer1.equals(singer2));

        logger.info(singer1.toString());
        logger.info(singer2.toString());
    }
}
