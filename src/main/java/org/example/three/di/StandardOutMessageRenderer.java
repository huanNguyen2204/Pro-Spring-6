package org.example.three.di;

import org.example.two.decoupled.MessageProvider;
import org.example.two.decoupled.MessageRenderer;

class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
