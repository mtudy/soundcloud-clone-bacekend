package io.mtudy.soundcloud.like.application.inputs;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
public class LikePlaylistInput {
    @NotBlank
    private String playlistId;

    public LikePlaylistInput(String playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistId() {
        return playlistId;
    }
}
