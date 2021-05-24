package io.mtudy.soundcloud.music.application.assemblers;

import io.mtudy.soundcloud.music.application.dtos.TrackDTO;
import io.mtudy.soundcloud.music.domain.entities.Track;
import org.springframework.stereotype.Component;

@Component
public class TrackAssembler {
    public TrackDTO writeDTO(Track track) {
        var dto = new TrackDTO();
        dto.setId(track.getId());
        dto.setAuthorId(track.getAuthorId());
        dto.setTitle(track.getTitle());
        dto.setArtworkUrl(track.getArtworkUrl());

        return dto;
    }
}
