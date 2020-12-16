package io.mtudy.soundcloud.music.application.services;

import io.mtudy.soundcloud.music.application.inputs.CreateTrackInput;
import io.mtudy.soundcloud.music.domain.entities.Track;
import io.mtudy.soundcloud.music.domain.repotitories.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateTrackService {
    private final TrackRepository repository;

    public CreateTrackService(TrackRepository repository) {
        this.repository = repository;
    }

    public Track run(CreateTrackInput request) {
        return this.repository.save(new Track(
            UUID.randomUUID().toString(), UUID.randomUUID().toString(), request.getTitle(), request.getArtworkUrl()
        ));
    }
}
