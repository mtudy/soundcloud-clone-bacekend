package io.mtudy.soundcloud.music.application.inputs;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreateMusicInput {
    private String title;

    public CreateMusicInput(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
