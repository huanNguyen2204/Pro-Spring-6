package org.example.three.constructor;

import org.example.two.decoupled.MessageProvider;
import org.example.two.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }
}
