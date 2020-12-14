package io.mtudy.soundcloud.music.domain.entities;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Entity(name = "track")
public class Track {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(length = 36)
    private String id;

    @Column
    private String authorId;

    @Column
    private String title;

    public Track(String title) {
        this.title = title;
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
}
