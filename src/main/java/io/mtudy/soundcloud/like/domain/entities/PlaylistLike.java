package io.mtudy.soundcloud.like.domain.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "playlist_like")
public class PlaylistLike {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    @Column(columnDefinition = "VARCHAR(36)")
    private String playlistId;

    @Column(columnDefinition = "VARCHAR(36)")
    private String authorId;

    public PlaylistLike(String id, String playlistId, String authorId) {
        this.id = id;
        this.playlistId = playlistId;
        this.authorId = authorId;
    }

    public String getId() {
        return id;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public String getAuthorId() {
        return authorId;
    }
}
