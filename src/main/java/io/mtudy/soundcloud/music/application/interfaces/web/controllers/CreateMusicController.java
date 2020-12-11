package io.mtudy.soundcloud.music.application.interfaces.web.controllers;

import io.mtudy.soundcloud.music.application.inputs.CreateMusicInput;
import io.mtudy.soundcloud.music.application.services.CreateMusicService;
import io.mtudy.soundcloud.music.domain.entities.Music;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateMusicController {
    private final CreateMusicService service;

    public CreateMusicController(CreateMusicService service) {
        this.service = service;
    }

    @PostMapping(
        value = "/musics",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Music run(@RequestBody CreateMusicInput request) {
        return this.service.run(request);
    }
}
