package io.mtudy.soundcloud.music.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.music.application.inputs.CreateTrackInput;
import io.mtudy.soundcloud.music.application.services.CreateTrackService;
import io.mtudy.soundcloud.music.domain.entities.Track;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class CreateTrackMutationResolver implements GraphQLMutationResolver {
    private final CreateTrackService service;

    public CreateTrackMutationResolver(@Valid CreateTrackService service) {
        this.service = service;
    }

    public Track createTrack(CreateTrackInput input) {
        return this.service.run(input);
    }
}
