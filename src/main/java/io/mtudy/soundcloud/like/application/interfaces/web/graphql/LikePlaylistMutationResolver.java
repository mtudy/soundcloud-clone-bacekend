package io.mtudy.soundcloud.like.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.like.application.inputs.LikePlaylistInput;
import io.mtudy.soundcloud.like.application.services.LikePlaylistService;
import io.mtudy.soundcloud.like.domain.entities.PlaylistLike;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class LikePlaylistMutationResolver implements GraphQLMutationResolver {
    private final LikePlaylistService service;

    public LikePlaylistMutationResolver(LikePlaylistService service) {
        this.service = service;
    }

    public PlaylistLike likePlaylist(@Valid LikePlaylistInput input) {
        return this.service.run(input);
    }
}
