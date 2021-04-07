package io.mtudy.soundcloud.music.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.music.application.inputs.CreatePlaylistInput;
import io.mtudy.soundcloud.music.application.services.CreatePlaylistService;
import io.mtudy.soundcloud.music.domain.entities.Playlist;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class CreatePlaylistResolver implements GraphQLMutationResolver {
    private final CreatePlaylistService service;

    public CreatePlaylistResolver(CreatePlaylistService service) {
        this.service = service;
    }

    public Playlist createPlaylist(@Valid CreatePlaylistInput input) {
        return this.service.run(input);
    }
}
