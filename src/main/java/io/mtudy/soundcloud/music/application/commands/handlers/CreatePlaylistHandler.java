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

    public Playlist run(CreatePlaylistCommand input) {
        var builder = new Playlist.Builder(
            UUID.randomUUID().toString(),
            input.getTitle(),
            input.getGenre(),
            input.getPrivate(),
            input.getTrackIds()
        );

        if (input.getReleaseDate() != null) {
            builder.withReleaseDate(input.getReleaseDate());
        }

        if (input.getTags() != null) {
            builder.withTags(input.getTags());
        }

        if (input.getDescription() != null) {
            builder.withDescription(input.getDescription());
        }

        return this.repository.save(builder.build());
    }
}
