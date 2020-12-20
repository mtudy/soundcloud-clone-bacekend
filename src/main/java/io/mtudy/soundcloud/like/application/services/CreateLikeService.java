package io.mtudy.soundcloud.like.application.services;

import io.mtudy.soundcloud.like.application.inputs.CreateLikeInput;
import io.mtudy.soundcloud.like.domain.entities.Like;
import io.mtudy.soundcloud.like.domain.repotitories.LikeRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateLikeService {
    private final LikeRepository repository;

    public CreateLikeService(LikeRepository repository) {
        this.repository = repository;
    }

    public Like run(CreateLikeInput request) {
        return this.repository.save(new Like(
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            request.getType(),
            request.getTypeId()
        ));
    }
}
