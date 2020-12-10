package io.mtudy.soundcloud.music.application.requests;

import lombok.NoArgsConstructor;

public class CreateMusicRequest {
    private String title;

    public CreateMusicRequest() {
    }

    public CreateMusicRequest(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
