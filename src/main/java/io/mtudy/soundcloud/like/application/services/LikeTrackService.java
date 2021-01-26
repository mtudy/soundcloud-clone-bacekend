package io.mtudy.soundcloud.like.application.services;

import io.mtudy.soundcloud.like.application.inputs.LikeAlbumInput;
import io.mtudy.soundcloud.like.application.inputs.LikeTrackInput;
import io.mtudy.soundcloud.like.domain.entities.TrackLike;
import io.mtudy.soundcloud.like.domain.repotitories.TrackLikeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LikeTrackService {
    private final TrackLikeRepository repository;

    public LikeTrackService(TrackLikeRepository repository) {
        this.repository = repository;
    }

    public TrackLike run(LikeTrackInput request) {
        return this.repository.save(new TrackLike(
            UUID.randomUUID().toString(), request.getTrackId(), UUID.randomUUID().toString()
        ));
    }
}
