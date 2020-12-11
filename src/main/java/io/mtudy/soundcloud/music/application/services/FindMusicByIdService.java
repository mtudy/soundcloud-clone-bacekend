package io.mtudy.soundcloud.music.application.services;

import io.mtudy.soundcloud.music.domain.entities.Music;
import io.mtudy.soundcloud.music.domain.repotitories.MusicRepository;
import org.springframework.stereotype.Service;

@Service
public class FindMusicByIdService {
    private final MusicRepository repository;

    public FindMusicByIdService(MusicRepository repository) {
        this.repository = repository;
    }

    public Music run(String id) {
        return this.repository.findById(id).orElseThrow();
    }
}
