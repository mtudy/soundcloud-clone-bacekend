package io.mtudy.soundcloud.like.application.services;

import io.mtudy.soundcloud.like.application.inputs.LikeAlbumInput;
import io.mtudy.soundcloud.like.domain.entities.AlbumLike;
import io.mtudy.soundcloud.like.domain.repotitories.AlbumLikeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LikeAlbumService {
    private final AlbumLikeRepository repository;

    public LikeAlbumService(AlbumLikeRepository repository) {
        this.repository = repository;
    }

    public AlbumLike run(LikeAlbumInput request) {
        return this.repository.save(new AlbumLike(
            UUID.randomUUID().toString(), request.getAlbumId(), UUID.randomUUID().toString()
        ));
    }
}
