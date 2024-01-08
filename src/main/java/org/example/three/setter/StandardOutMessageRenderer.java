package org.example.three.setter;

import org.example.two.decoupled.MessageProvider;
import org.example.two.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        System.out.println("~~ Injecting dependency using setter ~~");
        this.messageProvider = provider;
    }
}
