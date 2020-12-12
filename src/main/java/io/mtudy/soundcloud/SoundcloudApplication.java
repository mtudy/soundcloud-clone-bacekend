package io.mtudy.soundcloud;

import graphql.kickstart.spring.web.boot.GraphQLWebsocketAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
    GraphQLWebsocketAutoConfiguration.class
})
public class SoundcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoundcloudApplication.class, args);
    }

}
