package io.mtudy.soundcloud.like.application.services;

import io.mtudy.soundcloud.like.application.inputs.CreatePlaylistLikeInput;
import io.mtudy.soundcloud.like.domain.entities.Like;
import io.mtudy.soundcloud.like.domain.entities.PlaylistLike;
import io.mtudy.soundcloud.like.domain.repotitories.LikeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateLikeService {
    private final LikeRepository repository;

    public CreateLikeService(LikeRepository repository) {
        this.repository = repository;
    }

    public Like run(CreatePlaylistLikeInput request) {
        var builder = new PlaylistLike.Builder(
            UUID.randomUUID().toString(),
            request.getPlaylistId(),
            UUID.randomUUID().toString()
        );

        return this.repository.save(builder.build());
    }
}
