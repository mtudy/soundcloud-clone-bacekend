package io.mtudy.soundcloud.music.application.commands.handlers;

import io.mtudy.soundcloud.music.application.commands.CreateTrackInput;
import io.mtudy.soundcloud.music.domain.entities.Track;
import io.mtudy.soundcloud.music.domain.repotitories.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateTrackHandler {
    private final TrackRepository repository;

    public CreateTrackHandler(TrackRepository repository) {
        this.repository = repository;
    }

    public Track run(CreateTrackInput request) {
        return this.repository.save(new Track(
            UUID.randomUUID().toString(), UUID.randomUUID().toString(), request.getTitle(), request.getArtworkUrl()
        ));
    }
}
