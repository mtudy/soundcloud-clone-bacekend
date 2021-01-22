package io.mtudy.soundcloud.like.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import io.mtudy.soundcloud.like.application.inputs.CreatePlaylistLikeInput;
import io.mtudy.soundcloud.like.application.services.CreateLikeService;
import io.mtudy.soundcloud.like.domain.entities.Like;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class CreateLikeMutationResolver implements GraphQLMutationResolver {
    private final CreateLikeService service;

    public CreateLikeMutationResolver(CreateLikeService service) {
        this.service = service;
    }

    public Like createLike(@Valid CreatePlaylistLikeInput input) {
        return this.service.run(input);
    }
}
