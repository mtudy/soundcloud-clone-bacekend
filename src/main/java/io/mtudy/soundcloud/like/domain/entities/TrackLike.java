package io.mtudy.soundcloud.like.domain.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "track_like")
public class TrackLike {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    @Column(columnDefinition = "VARCHAR(36)")
    private String trackId;

    @Column(columnDefinition = "VARCHAR(36)")
    private String authorId;

    public TrackLike(String id, String trackId, String authorId) {
        this.id = id;
        this.trackId = trackId;
        this.authorId = authorId;
    }

    public String getId() {
        return id;
    }

    public String getTrackId() {
        return trackId;
    }

    public String getAuthorId() {
        return authorId;
    }
}
