package io.mtudy.soundcloud.like.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.like.application.inputs.LikeAlbumInput;
import io.mtudy.soundcloud.like.application.services.LikeAlbumService;
import io.mtudy.soundcloud.like.domain.entities.AlbumLike;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class LikeAlbumMutationResolver implements GraphQLMutationResolver {
    private final LikeAlbumService service;

    public LikeAlbumMutationResolver(LikeAlbumService service) {
        this.service = service;
    }

    public AlbumLike likeAlbum(@Valid LikeAlbumInput input) {
        return this.service.run(input);
    }
}
