package io.mtudy.soundcloud.like.domain.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity(name = "like")
public class Like {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    @Column(columnDefinition = "VARCHAR(36)")
    private String authorId;

    @Column
    private String type;

    @Column
    private String typeId;

    public Like(String id, String authorId, String type, String typeId) {
        this.id = id;
        this.authorId = authorId;
        this.type = type;
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getType() {
        return type;
    }

    public String getTypeId() {
        return typeId;
    }
}
