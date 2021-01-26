package io.mtudy.soundcloud.like.application.inputs;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
public class LikeTrackInput {
    @NotBlank
    private String trackId;

    public LikeTrackInput(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackId() {
        return trackId;
    }
}
