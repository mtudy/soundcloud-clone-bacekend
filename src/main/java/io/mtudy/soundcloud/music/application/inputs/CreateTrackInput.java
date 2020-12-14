package io.mtudy.soundcloud.music.application.inputs;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreateTrackInput {
    private String title;

    public CreateTrackInput(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
