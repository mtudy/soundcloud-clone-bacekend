package io.mtudy.soundcloud.music.application.commands.handlers;

import io.mtudy.soundcloud.music.domain.entities.Track;
import io.mtudy.soundcloud.music.domain.repotitories.TrackRepository;
import org.springframework.stereotype.Service;

@Service
public class FindTrackByIdHandler {
    private final TrackRepository repository;

    public FindTrackByIdHandler(TrackRepository repository) {
        this.repository = repository;
    }

    public Track run(String id) {
        return this.repository.findById(id).orElseThrow();
    }
}
