package io.mtudy.soundcloud.music.application.commands;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
public final class CreatePlaylistCommand {
    @NotBlank
    private String title;

    @NotNull
    private String genre;

    @NotNull
    private boolean isPrivate;

    @NotNull
    private List<String> trackIds;

    @Null
    private Date releaseDate;

    @Null
    private String tags;

    @Null
    private String description;

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean getPrivate() {
        return isPrivate;
    }

    public List<String> getTrackIds() {
        return trackIds;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getTags() {
        return tags;
    }

    public String getDescription() {
        return description;
    }
}
