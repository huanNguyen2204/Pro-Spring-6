package org.example.three.field;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Inspiration {
    private String lyric = "I can keep the door cracked open, to let light thought";

    public Inspiration(@Value("For all my running, I can understand") String lyric) {
        this.lyric = lyric;
    }

    public String getLyric() {
        return lyric;
    }

    public void getLyric(String lyric) {
        this.lyric = lyric;
    }
}

public class SingerFieldInjectionDemo {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Singer.class, Inspiration.class);
        ctx.refresh();

        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();
    }
}