package io.mtudy.soundcloud.music.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.mtudy.soundcloud.music.application.services.FindMusicByIdService;
import io.mtudy.soundcloud.music.domain.entities.Music;
import org.springframework.stereotype.Component;

@Component
public class MusicQueryResolver implements GraphQLQueryResolver {
    private final FindMusicByIdService service;

    public MusicQueryResolver(FindMusicByIdService service) {
        this.service = service;
    }

    public Music music(String id) {
        return this.service.run(id);
    }
}
