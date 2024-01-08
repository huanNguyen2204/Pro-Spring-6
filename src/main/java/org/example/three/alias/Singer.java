package org.example.three.alias;

import org.springframework.stereotype.Component;

@Component("johnMayer")
@Trophy(name={"grammy", "platinum disk"})
public class Singer {

    private String lyric = "I used to crave the sight of you";

    public void String() {
        System.out.println(lyric);
    }
}
