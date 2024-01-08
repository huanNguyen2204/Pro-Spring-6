package org.example.three.configurable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("provider")
class ConfigurableMessageProvider {

    private String message;

    public ConfigurableMessageProvider(@Value("Configurable message") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
