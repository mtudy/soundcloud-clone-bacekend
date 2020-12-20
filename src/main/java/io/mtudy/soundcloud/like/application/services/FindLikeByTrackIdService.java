package io.mtudy.soundcloud.like.application.services;

import io.mtudy.soundcloud.like.domain.entities.Like;
import io.mtudy.soundcloud.like.domain.repotitories.LikeRepository;
import org.springframework.stereotype.Service;

@Service
public class FindLikeByTrackIdService {
    private final LikeRepository repository;

    public FindLikeByTrackIdService(LikeRepository repository) {
        this.repository = repository;
    }

    public Like run(String id) {
        return this.repository.findByTrackId(id);
    }
}
