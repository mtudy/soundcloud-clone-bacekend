package io.mtudy.soundcloud.music.application.services;

import io.mtudy.soundcloud.music.application.requests.CreateMusicRequest;
import io.mtudy.soundcloud.music.domain.entities.Music;
import io.mtudy.soundcloud.music.domain.repotitories.MusicRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateMusicService {
    private final MusicRepository repository;

    public CreateMusicService(MusicRepository repository) {
        this.repository = repository;
    }

    public Music run(CreateMusicRequest request) {
        return this.repository.save(new Music(request.getTitle()));
    }
}
