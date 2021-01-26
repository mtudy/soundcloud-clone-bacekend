package io.mtudy.soundcloud.like.domain.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "album_like")
public class AlbumLike {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    @Column(columnDefinition = "VARCHAR(36)")
    private String albumId;

    @Column(columnDefinition = "VARCHAR(36)")
    private String authorId;

    public AlbumLike(String id, String albumId, String authorId) {
        this.id = id;
        this.albumId = albumId;
        this.authorId = authorId;
    }

    public String getId() {
        return id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public String getAuthorId() {
        return authorId;
    }
}
