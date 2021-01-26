package io.mtudy.soundcloud.like.application.inputs;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
public class LikeAlbumInput {
    @NotBlank
    private String albumId;

    public LikeAlbumInput(String albumId) {
        this.albumId = albumId;
    }

    public String getAlbumId() {
        return albumId;
    }
}
