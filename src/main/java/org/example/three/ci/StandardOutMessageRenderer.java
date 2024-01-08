package org.example.three.ci;

import org.example.two.decoupled.MessageProvider;

class StandardOutMessageRenderer {

    private final MessageProvider messageProvider;

    public StandardOutMessageRenderer(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
