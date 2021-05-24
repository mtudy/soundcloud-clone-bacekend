package io.mtudy.soundcloud.music.application.commands.handlers;

import io.mtudy.soundcloud.music.application.commands.CreatePlaylistCommand;
import io.mtudy.soundcloud.music.domain.entities.Playlist;
import io.mtudy.soundcloud.music.domain.repotitories.PlaylistRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreatePlaylistHandler {
    private final PlaylistRepository repository;

    public CreatePlaylistHandler(PlaylistRepository repository) {
        this.repository = repository;
    }

    public Playlist handle(CreatePlaylistCommand input) {
        return this.repository.save(
            new Playlist.Builder(
                UUID.randomUUID().toString(),
                input.getTitle(),
                input.getGenre(),
                input.getPrivate(),
                input.getTrackIds()
            ).withReleaseDate(input.getReleaseDate())
                .withTags(input.getTags())
                .withDescription(input.getDescription())
                .build()
        );
    }
}
