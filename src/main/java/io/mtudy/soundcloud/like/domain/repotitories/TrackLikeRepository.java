package io.mtudy.soundcloud.like.domain.repotitories;

import io.mtudy.soundcloud.like.domain.entities.TrackLike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackLikeRepository extends CrudRepository<TrackLike, String> {
}
