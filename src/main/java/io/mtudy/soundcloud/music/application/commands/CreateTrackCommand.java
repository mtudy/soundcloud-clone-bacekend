package io.mtudy.soundcloud.music.application.commands;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
public class CreateTrackCommand {
    @NotBlank
    private String title;

    @NotBlank
    private String artworkUrl;

    public CreateTrackCommand(String title, String artworkUrl) {
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
