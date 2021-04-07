package io.mtudy.soundcloud.music.domain.entities;

import io.mtudy.soundcloud.music.domain.enums.PlaylistType;
import io.mtudy.soundcloud.music.infrastructure.entities.TrackIdsInPlaylistConverter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@MappedSuperclass
public class BasePlaylist {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    protected String id;

    @Column(nullable = false)
    protected String title;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    protected PlaylistType playlistType;

    @Column(nullable = false)
    protected String genre;

    @Column(nullable = false)
    protected Boolean isPrivate;

    @Column(nullable = false, columnDefinition = "JSON")
    @Convert(converter = TrackIdsInPlaylistConverter.class)
    protected List<String> trackIds;

    @Column(nullable = true)
    protected String artworkUrl;

    @Column(nullable = true)
    protected Date releaseDate;

    @Column(nullable = true)
    protected String tags;

    @Column(nullable = true)
    protected String description;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public PlaylistType getPlaylistType() {
        return playlistType;
    }

    public String getGenre() {
        return genre;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public List<String> getTrackIds() {
        return trackIds;
    }

    public String getArtworkUrl() {
        return artworkUrl;
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
