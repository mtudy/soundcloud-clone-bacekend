package io.mtudy.soundcloud.like.application.services;

import io.mtudy.soundcloud.like.application.inputs.LikePlaylistInput;
import io.mtudy.soundcloud.like.domain.entities.PlaylistLike;
import io.mtudy.soundcloud.like.domain.repotitories.PlaylistLikeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LikePlaylistService {
    private final PlaylistLikeRepository repository;

    public LikePlaylistService(PlaylistLikeRepository repository) {
        this.repository = repository;
    }

    public PlaylistLike run(LikePlaylistInput request) {
        return this.repository.save(new PlaylistLike(
            UUID.randomUUID().toString(), request.getPlaylistId(), UUID.randomUUID().toString()
        ));
    }
}
