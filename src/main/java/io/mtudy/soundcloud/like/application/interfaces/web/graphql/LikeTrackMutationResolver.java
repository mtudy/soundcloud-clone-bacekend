package io.mtudy.soundcloud.like.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.like.application.inputs.LikeTrackInput;
import io.mtudy.soundcloud.like.application.services.LikeTrackService;
import io.mtudy.soundcloud.like.domain.entities.TrackLike;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class LikeTrackMutationResolver implements GraphQLMutationResolver {
    private final LikeTrackService service;

    public LikeTrackMutationResolver(LikeTrackService service) {
        this.service = service;
    }

    public TrackLike likeTrack(@Valid LikeTrackInput input) {
        return this.service.run(input);
    }
}
