package io.mtudy.soundcloud.music.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.music.application.inputs.CreateMusicInput;
import io.mtudy.soundcloud.music.application.services.CreateMusicService;
import io.mtudy.soundcloud.music.domain.entities.Music;
import org.springframework.stereotype.Component;

@Component
public class CreateMusicMutationResolver implements GraphQLMutationResolver {
    private final CreateMusicService service;

    public CreateMusicMutationResolver(CreateMusicService service) {
        this.service = service;
    }

    public Music createMusic(CreateMusicInput input) {
        return this.service.run(input);
    }
}
