package io.mtudy.soundcloud.like.domain.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",
    discriminatorType = DiscriminatorType.STRING)
public abstract class Like {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    protected String id;

    @Column(columnDefinition = "VARCHAR(36)")
    protected String authorId;

    @Column(columnDefinition = "VARCHAR(36)")
    protected String typeId;

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getTypeId() {
        return typeId;
    }
}
