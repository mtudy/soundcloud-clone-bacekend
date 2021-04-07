package io.mtudy.soundcloud.music.application.services;

import io.mtudy.soundcloud.music.application.inputs.CreatePlaylistInput;
import io.mtudy.soundcloud.music.domain.entities.Playlist;
import io.mtudy.soundcloud.music.domain.repotitories.PlaylistRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreatePlaylistService {
    private final PlaylistRepository repository;

    public CreatePlaylistService(PlaylistRepository repository) {
        this.repository = repository;
    }

    public Playlist run(CreatePlaylistInput input) {
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
