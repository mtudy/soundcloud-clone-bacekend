package io.mtudy.soundcloud.music.application.services;

import io.mtudy.soundcloud.music.domain.entities.Track;
import io.mtudy.soundcloud.music.domain.repotitories.TrackRepository;
import org.springframework.stereotype.Service;

@Service
public class FindTrackByIdService {
    private final TrackRepository repository;

    public FindTrackByIdService(TrackRepository repository) {
        this.repository = repository;
    }

    public Track run(String id) {
        return this.repository.findById(id).orElseThrow();
    }
}
