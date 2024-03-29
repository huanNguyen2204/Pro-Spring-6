package org.example.three.collectioninject;

import org.example.three.nesting.Song;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CollectionConfig {

    @Bean
    public List<Song> list() {
        return List.of(
            new Song("Not the end"),
            new Song("Rise up")
        );
    }

    @Bean
    public Song song1() {
        return new Song("Here's to hoping");
    }

    @Bean
    public Song song2() {
        return new Song("Wishing the best for you");
    }
}
