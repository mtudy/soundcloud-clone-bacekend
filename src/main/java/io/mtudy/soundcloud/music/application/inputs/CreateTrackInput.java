package io.mtudy.soundcloud.music.application.inputs;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
public class CreateTrackInput {
    @NotBlank
    private String title;

    @NotBlank
    private String artworkUrl;

    public CreateTrackInput(String title, String artworkUrl) {
        this.title = title;
        this.artworkUrl = artworkUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtworkUrl() {
        return artworkUrl;
    }
}
