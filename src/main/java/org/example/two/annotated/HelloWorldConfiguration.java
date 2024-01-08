package org.example.two.annotated;

import org.apache.logging.log4j.message.Message;
import org.example.two.decoupled.HelloWorldMessageProvider;
import org.example.two.decoupled.MessageProvider;
import org.example.two.decoupled.MessageRenderer;
import org.example.two.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
