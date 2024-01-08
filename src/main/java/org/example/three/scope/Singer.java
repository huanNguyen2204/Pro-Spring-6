package org.example.three.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("nonSingleton")
public class Singer {

    private String name = "unknow";

    public Singer(@Value("John Mayer") String name) {
        this.name = name;
    }
}
