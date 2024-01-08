package org.example.three.generator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.UUID;

@Configuration
@Component(nameGenertor = SimpleBeanNameGenerator.class)
class BeanNamingConfig {}

class SimpleBeanNameGenerator extends AnnotationBeanNameGenerator {

    @Override
    protected String buildDefaultBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        var beanName = definition.getBeanClassName().substring(definition
            .getBeanClassName()
            .lastIndexOf(".") + 1)
            .toLowerCase(Locale.ROOT);

        var uid = UUID.randomUUID().toString().replace("-", "").substring(0,8);

        return beanName + "-" + uid;
    }
}
