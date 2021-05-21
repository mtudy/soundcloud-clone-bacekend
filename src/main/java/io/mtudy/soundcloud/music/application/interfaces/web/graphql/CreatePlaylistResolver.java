package io.mtudy.soundcloud.music.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.music.application.commands.CreatePlaylistCommand;
import io.mtudy.soundcloud.music.application.commands.handlers.CreatePlaylistHandler;
import io.mtudy.soundcloud.music.domain.entities.Playlist;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class CreatePlaylistResolver implements GraphQLMutationResolver {
    private final CreatePlaylistHandler service;

    public CreatePlaylistResolver(CreatePlaylistHandler service) {
        this.service = service;
    }

    public Playlist createPlaylist(@Valid CreatePlaylistCommand input) {
        return this.service.run(input);
    }
}
