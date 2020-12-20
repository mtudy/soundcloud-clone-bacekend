package io.mtudy.soundcloud.like.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.mtudy.soundcloud.like.application.services.FindLikeByTrackIdService;
import io.mtudy.soundcloud.like.domain.entities.Like;
import org.springframework.stereotype.Component;

@Component
public class LikeQueryResolver implements GraphQLQueryResolver {
    private final FindLikeByTrackIdService service;

    public LikeQueryResolver(FindLikeByTrackIdService service) {
        this.service = service;
    }

    public Like like(String id) {
        return this.service.run(id);
    }
}
