package io.mtudy.soundcloud.music.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.music.application.commands.CreateTrackCommand;
import io.mtudy.soundcloud.music.application.commands.handlers.CreateTrackHandler;
import io.mtudy.soundcloud.music.application.dtos.TrackDTO;
import io.mtudy.soundcloud.music.domain.entities.Track;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class CreateTrackMutationResolver implements GraphQLMutationResolver {
    private final CreateTrackHandler service;

    public CreateTrackMutationResolver(CreateTrackHandler service) {
        this.service = service;
    }

    public TrackDTO createTrack(@Valid CreateTrackCommand input) {
        return this.service.handle(input);
    }
}
