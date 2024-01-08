package org.example.two.decoupled;

import org.example.three.ManagedComponent;

import static java.lang.System.*;

class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public StandardOutMessageRenderer() {
        out.println("--> StandardOutMessageRenderer: constructor called");
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                "You must set the property messageProvider of class: "
                + StandardOutMessageRenderer.class.getName()
            );
        }
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        out.println("--> StandardOutMessageRenderer: setting the provider");
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
