package org.example.three.constructor;

import org.example.two.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

}
