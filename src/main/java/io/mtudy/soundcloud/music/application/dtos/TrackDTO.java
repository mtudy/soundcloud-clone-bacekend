package io.mtudy.soundcloud.music.application.dtos;

import lombok.Data;

@Data
public class TrackDTO {
    private String id;

    private String authorId;

    private String title;

    private String artworkUrl;
}
