package io.mtudy.soundcloud.music.domain.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity(name = "track")
public class Track {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    @Column
    private String authorId;

    @Column
    private String title;

    @Column
    private String artworkUrl;

    public Track(String id, String authorId, String title, String artworkUrl) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
        this.artworkUrl = artworkUrl;
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtworkUrl() {
        return artworkUrl;
    }
}
