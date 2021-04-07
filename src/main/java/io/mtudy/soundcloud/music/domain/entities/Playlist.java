package io.mtudy.soundcloud.music.domain.entities;

import io.mtudy.soundcloud.music.domain.enums.PlaylistType;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Entity(name = "playlist")
public final class Playlist extends BasePlaylist {
    private Playlist(Builder builder) {
        this.playlistType = PlaylistType.PLAYLIST;
        this.id = builder.id;
        this.title = builder.title;
        this.genre = builder.genre;
        this.isPrivate = builder.isPrivate;
        this.trackIds = builder.trackIds;
        this.artworkUrl = null;
        this.tags = builder.tags;
        this.releaseDate = builder.releaseDate;
        this.description = builder.description;;
    }

    public final static class Builder {
        private final String id;

        private final String title;

        private final String genre;

        private final boolean isPrivate;

        private final List<String> trackIds;

        private Date releaseDate;

        private String tags;

        private String description;

        public Builder(String id, String title, String genre, boolean isPrivate, List<String> trackIds) {
            this.id = id;
            this.title = title;
            this.genre = genre;
            this.isPrivate = isPrivate;
            this.trackIds = trackIds;
        }

        public Builder withReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder withTags(String tags) {
            this.tags = tags;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Playlist build() {
            return new Playlist(this);
        }
    }
}
