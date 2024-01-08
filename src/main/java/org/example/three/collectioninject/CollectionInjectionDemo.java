package org.example.three.collectioninject;

import org.example.three.nesting.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class CollectingBean {

    @Autowired
    List<Song> songList;

    public void printCollections() {
        songList.forEach(s -> System.out.println(s.getTitle()));
    }
}

public class CollectionInjectionDemo {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(CollectionConfig.class, CollectingBean.class);
        ctx.refresh();

        var collectingBean = ctx.getBean(CollectingBean.class);
        collectingBean.printCollections();
    }
}
