package io.mtudy.soundcloud.music.application.interfaces.web.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.mtudy.soundcloud.music.application.services.FindTrackByIdService;
import io.mtudy.soundcloud.music.domain.entities.Track;
import org.springframework.stereotype.Component;

@Component
public class TrackQueryResolver implements GraphQLQueryResolver {
    private final FindTrackByIdService service;

    public TrackQueryResolver(FindTrackByIdService service) {
        this.service = service;
    }

    public Track track(String id) {
        return this.service.run(id);
    }
}
