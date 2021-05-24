package io.mtudy.soundcloud.music.application.commands.handlers;

import io.mtudy.soundcloud.music.application.assemblers.TrackAssembler;
import io.mtudy.soundcloud.music.application.commands.CreateTrackCommand;
import io.mtudy.soundcloud.music.application.dtos.TrackDTO;
import io.mtudy.soundcloud.music.domain.entities.Track;
import io.mtudy.soundcloud.music.domain.repotitories.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateTrackHandler {
    private final TrackRepository repository;

    private final TrackAssembler assembler;

    public CreateTrackHandler(TrackRepository repository, TrackAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    public TrackDTO handle(CreateTrackCommand request) {
        return assembler.writeDTO(
            repository.save(new Track(
                UUID.randomUUID().toString(), UUID.randomUUID().toString(), request.getTitle(), request.getArtworkUrl()
            ))
        );
    }
}
