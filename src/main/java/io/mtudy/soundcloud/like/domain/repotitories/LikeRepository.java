package io.mtudy.soundcloud.like.domain.repotitories;

import io.mtudy.soundcloud.like.domain.entities.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends CrudRepository<Like, String> {
    public default Like findByTrackId(String trackId) {
        return null;
    }
}
