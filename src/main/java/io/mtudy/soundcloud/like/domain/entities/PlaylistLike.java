package io.mtudy.soundcloud.like.domain.entities;

import io.mtudy.soundcloud.like.domain.enums.LikeType;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@NoArgsConstructor
@Entity(name = "playlistLike")
@DiscriminatorValue(LikeType.Values.PLAYLIST)
public final class PlaylistLike extends Like {
    private PlaylistLike(Builder builder) {
        this.id = builder.id;
        this.typeId = builder.typeId;
        this.authorId = builder.authorId;
    }

    public final static class Builder {
        private final String id;

        private final String typeId;

        private final String authorId;

        public Builder(String id, String typeId, String authorId) {
            this.id = id;
            this.typeId = typeId;
            this.authorId = authorId;
        }

        public PlaylistLike build() {
            return new PlaylistLike(this);
        }
    }
}
